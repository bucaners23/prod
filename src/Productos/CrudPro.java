package Productos;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CrudPro {

	private JFrame frmProductos;
	private JTextField txtNom;
	private JTextField txtPro;
	private JTextField txtPre;
	private JTextField txtExi;
	private JTextField txtDes;
	private JTextField txtUni;
	private JButton btnIns;
	private JButton btnCar;
	private JButton btnAct;
	private JButton btnEli;
	private JButton btnBor;
	DataProducto xd=new DataProducto();
	
	private JTextField txtId;

	public static void main(String[] args) {
		CrudPro x=new CrudPro();
		x.frmProductos.setVisible(true);
	}
	public CrudPro() {
		initialize();
	}

	public void Ya() {
		txtDes.setText("");
		txtExi.setText("");
		txtId.setText("");
		txtNom.setText("");
		txtPre.setText("");
		txtPro.setText("");
		txtUni.setText("");
	}
	
	private void initialize() {
		frmProductos = new JFrame();
		frmProductos.setIconImage(Toolkit.getDefaultToolkit().getImage(CrudPro.class.getResource("/Productos/6073873 (2).png")));
		frmProductos.setTitle("Productos");
		frmProductos.setBounds(100, 100, 747, 359);
		frmProductos.setLocationRelativeTo(null);
		frmProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProductos.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id producto :");
		lblId.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblId.setBounds(10, 23, 127, 29);
		frmProductos.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblNombre.setBounds(10, 63, 127, 29);
		frmProductos.getContentPane().add(lblNombre);
		
		JLabel lblProveedor = new JLabel("Proveedor :");
		lblProveedor.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblProveedor.setBounds(10, 107, 127, 29);
		frmProductos.getContentPane().add(lblProveedor);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblPrecio.setBounds(10, 150, 127, 29);
		frmProductos.getContentPane().add(lblPrecio);
		
		JLabel lblExistencia = new JLabel("Existencia :");
		lblExistencia.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblExistencia.setBounds(10, 190, 127, 29);
		frmProductos.getContentPane().add(lblExistencia);
		
		JLabel lblDescripcion = new JLabel("Descripcion :");
		lblDescripcion.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblDescripcion.setBounds(10, 230, 127, 29);
		frmProductos.getContentPane().add(lblDescripcion);
		
		JLabel lblUnidad = new JLabel("Unidad :");
		lblUnidad.setFont(new Font("Letter Gothic Std", Font.BOLD, 15));
		lblUnidad.setBounds(10, 270, 127, 29);
		frmProductos.getContentPane().add(lblUnidad);
		
		txtNom = new JTextField();
		txtNom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNom.getText().length() >=30) {
					e.consume();
				}
			}
		});
		txtNom.setColumns(10);
		txtNom.setBounds(182, 66, 229, 20);
		frmProductos.getContentPane().add(txtNom);
		
		txtPro = new JTextField();
		txtPro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtPro.getText().length() >=30) {
					e.consume();
				}
			}
		});
		txtPro.setColumns(10);
		txtPro.setBounds(182, 107, 229, 20);
		frmProductos.getContentPane().add(txtPro);
		
		txtPre = new JTextField();
		txtPre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtPre.getText().length() >=10) {
					e.consume();
				}
			}
		});
		txtPre.setColumns(10);
		txtPre.setBounds(182, 153, 229, 20);
		frmProductos.getContentPane().add(txtPre);
		
		txtExi = new JTextField();
		txtExi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtExi.getText().length() >=5) {
					e.consume();
				}
			}
		});
		txtExi.setColumns(10);
		txtExi.setBounds(182, 193, 229, 20);
		frmProductos.getContentPane().add(txtExi);
		
		txtDes = new JTextField();
		txtDes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtDes.getText().length() >=100) {
					e.consume();
				}
			}
		});
		txtDes.setColumns(10);
		txtDes.setBounds(182, 233, 229, 20);
		frmProductos.getContentPane().add(txtDes);
		
		txtUni = new JTextField();
		txtUni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtUni.getText().length() >=20) {
					e.consume();
				}
			}
		});
		txtUni.setColumns(10);
		txtUni.setBounds(182, 273, 229, 20);
		frmProductos.getContentPane().add(txtUni);
		
		btnIns = new JButton("Insertar");
		btnIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataProducto c = new DataProducto();
					c.setIdProducto(Integer.parseInt(txtId.getText()));
					c.setNombres(txtNom.getText());
					c.setProvedor(txtPro.getText());
					c.setPrecios(txtPre.getText());
					c.setExistencias(txtExi.getText());
					c.setDescripcion(txtDes.getText());
					c.setUnidad(txtUni.getText());
					if (c.insertar()) {
						JOptionPane.showMessageDialog(null, "Se inserto correctamente");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnIns.setBounds(470, 41, 141, 29);
		frmProductos.getContentPane().add(btnIns);
		
		btnCar = new JButton("Cargar");
		btnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int idProducto = Integer.parseInt(JOptionPane.showInputDialog("ID a cargar"));
					xd.setIdProducto(idProducto);
					if (xd.cargar()) {
						txtId.setText("" + xd.getIdProducto());
						txtNom.setText(xd.getNombres());
						txtPro.setText(xd.getProvedor());
						txtPre.setText(xd.getPrecios());
						txtExi.setText(xd.getExistencias());
						txtDes.setText(xd.getDescripcion());
						txtUni.setText(xd.getUnidad());
						JOptionPane.showMessageDialog(null, "SE CARGO CORRECTAMENTE");
					} else {
						JOptionPane.showMessageDialog(null, "Error 404");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error 404");
				}
			}
		});
		btnCar.setBounds(470, 86, 141, 29);
		frmProductos.getContentPane().add(btnCar);
		
		btnAct = new JButton("Actualizar");
		btnAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					xd.setIdProducto(Integer.parseInt(txtId.getText()));
					xd.setNombres(txtNom.getText());
					xd.setProvedor(txtPro.getText());
					xd.setPrecios(txtPre.getText());
					xd.setExistencias(txtPro.getText());
					xd.setDescripcion(txtDes.getText());
					xd.setUnidad(txtUni.getText());
					if (xd.actualizar()) {
						JOptionPane.showMessageDialog(null, "Se actualizo con exito !!!");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnAct.setBounds(470, 126, 141, 29);
		frmProductos.getContentPane().add(btnAct);
		
		btnEli = new JButton("Eliminar");
		btnEli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int idProducto = Integer.parseInt(JOptionPane.showInputDialog("ID a cargar"));
					xd.setIdProducto(idProducto);
					if (xd.eliminar()) {
						JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
						Ya();
					} else {
						JOptionPane.showMessageDialog(null, "Error 404");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error 404");
				}
			}
		});
		btnEli.setBounds(470, 166, 141, 29);
		frmProductos.getContentPane().add(btnEli);
		
		btnBor = new JButton("Borrar");
		btnBor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ya();
			}
		});
		btnBor.setBounds(470, 206, 141, 29);
		frmProductos.getContentPane().add(btnBor);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(182, 26, 229, 20);
		frmProductos.getContentPane().add(txtId);
	}
}
