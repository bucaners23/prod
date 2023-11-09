package Productos;

public class DataProducto {
	int idProducto;
	String nombres;
	String provedor;
	String precios;
	String existencias;
	String descripcion;
	String unidad;
	Producto dc=new Producto();
	public DataProducto() {
		
	}

	public boolean insertar() {
		if (dc.insertar(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean eliminar() {
		if (dc.eliminar(this.getIdProducto())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean actualizar() {
		if (dc.actualizar(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cargar() {
		if (dc.cargar(this)) {
			return true;
		} else {
			return false;
		}

	}
	
	public DataProducto(int idProducto, String nombres, String provedor, String precios, String existencias,
			String descripcion, String unidad) {
		super();
		this.idProducto = idProducto;
		this.nombres = nombres;
		this.provedor = provedor;
		this.precios = precios;
		this.existencias = existencias;
		this.descripcion = descripcion;
		this.unidad = unidad;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getProvedor() {
		return provedor;
	}
	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	public String getPrecios() {
		return precios;
	}
	public void setPrecios(String precios) {
		this.precios = precios;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	

}
