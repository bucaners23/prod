package Productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto {
	Connection cx;

	public Producto() {

	}

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/producto", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}

	public boolean insertar(DataProducto c) {
		PreparedStatement ps = null;
		try {
			ps = conectar().prepareStatement("INSERT INTO datos VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, c.getIdProducto());
			ps.setString(2, c.getNombres());
			ps.setString(3, c.getProvedor());
			ps.setString(4, c.getPrecios());
			ps.setString(5, c.getExistencias());
			ps.setString(6, c.getDescripcion());
			ps.setString(7, c.getUnidad());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean cargar(DataProducto c) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conectar().prepareStatement("SELECT * FROM  datos WHERE idpro=?");
			ps.setInt(1, c.getIdProducto());
			rs = ps.executeQuery();
			if (rs.next()) {
				c.setNombres(rs.getString(2));
				c.setProvedor(rs.getString(3));
				c.setPrecios(rs.getString(4));
				c.setExistencias(rs.getString(5));
				c.setDescripcion(rs.getString(6));
				c.setUnidad(rs.getString(7));
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean eliminar(int idProducto) {
		PreparedStatement ps = null;
		try {
			DataProducto x = new DataProducto();
			x.setIdProducto(idProducto);
			if (x.cargar()) {
				ps = conectar().prepareStatement("DELETE FROM datos WHERE idpro=?");
				ps.setInt(1, idProducto);
				ps.execute();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean actualizar(DataProducto c) {
		PreparedStatement ps = null;
		try {
			DataProducto x = new DataProducto();
			x.setIdProducto(c.getIdProducto());
			if (x.cargar()) {
				ps = conectar().prepareStatement(
						"UPDATE datos SET nombre=?,proveedor=?,precio=?,existencia=?,descripcion=?,unidad=?" + "WHERE idpro=?");
				ps.setString(1, c.getNombres());
				ps.setString(2, c.getProvedor());
				ps.setString(3, c.getPrecios());
				ps.setString(4, c.getExistencias());
				ps.setString(5, c.getDescripcion());
				ps.setString(6, c.getUnidad());
				ps.setInt(7, c.getIdProducto());
				ps.execute();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

}
