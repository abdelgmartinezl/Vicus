package com.vicus.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.toedter.calendar.JCalendar;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class VicusPrincipal {

	private JFrame frmVicusPrincipal;
	private JTable tbEventos;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextArea txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCelular;
	private JTextField txtFax;
	private JTextField txtApartadoPostal;
	private JTextField txtEmail;
	private JTextField txtTitulo;
	private JTextField txtDescripcion_Contactos;
	private JTextField txtId;
	private JTextField txtRaza;
	private JTextField txtSexo;
	private JTextField txtTipo;
	private JTextField txtMadre;
	private JTextField txtFechaNacimiento;
	private JTextField txtMedicamentos;
	private JTextField txtDescripcion_Inventario;
	private JTable tbIngreso;
	private JTable tbEgresos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
					VicusPrincipal window = new VicusPrincipal();
					window.frmVicusPrincipal.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
	public VicusPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVicusPrincipal = new JFrame();
		frmVicusPrincipal.setTitle("Vicus - Software de Gesti\u00F3n Ganadera");
		frmVicusPrincipal.setBounds(100, 100, 850, 650);
		frmVicusPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVicusPrincipal.setUndecorated(true);
		frmVicusPrincipal.getContentPane().setLayout(null);
		
		JButton btnPreferencias = new JButton("Preferencias");
		btnPreferencias.setMnemonic('p');
		btnPreferencias.setForeground(new Color(0, 100, 0));
		btnPreferencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Modificara configuraciones basicas...");
			}
		});
		btnPreferencias.setToolTipText("Presiona esto si deseas modificar algunas configuraciones - [Alt + P]");
		btnPreferencias.setFont(new Font("Dialog", Font.BOLD, 15));
		btnPreferencias.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPreferencias.setBackground(new Color(173, 255, 47));
		btnPreferencias.setBounds(299, 51, 136, 39);
		frmVicusPrincipal.getContentPane().add(btnPreferencias);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setMnemonic('a');
		btnAyuda.setForeground(new Color(0, 100, 0));
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Desplegara la ayuda...");
			}
		});
		btnAyuda.setToolTipText("¿No entiendes el programa? Este boton te ayudara - [Alt + A]");
		btnAyuda.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAyuda.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAyuda.setBackground(new Color(173, 255, 47));
		btnAyuda.setBounds(464, 51, 136, 39);
		frmVicusPrincipal.getContentPane().add(btnAyuda);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setMnemonic('s');
		btnSalir.setToolTipText("¿Desea salir? Presione este boton - [Alt + S]");
		btnSalir.setFont(new Font("Dialog", Font.BOLD, 15));
		btnSalir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSalir.setForeground(new Color(255, 255, 0));
		btnSalir.setBackground(new Color(128, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir de Vicus?", "Vicus - SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (r == 0) System.exit(0);
			}
		});
		btnSalir.setBounds(630, 51, 136, 39);
		frmVicusPrincipal.getContentPane().add(btnSalir);
		
		JPanel resumen = new JPanel();
		resumen.setBackground(new Color(204, 255, 102));
		resumen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		JPanel inventario = new JPanel();
		inventario.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		inventario.setBackground(new Color(204, 255, 102));
		JPanel contactos = new JPanel();
		contactos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contactos.setBackground(new Color(204, 255, 102));
		JPanel ingresos = new JPanel();
		ingresos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ingresos.setBackground(new Color(204, 255, 102));
		JPanel egresos = new JPanel();
		egresos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		egresos.setBackground(new Color(204, 255, 102));
		JPanel eventos = new JPanel();
		eventos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		eventos.setBackground(new Color(204, 255, 102));
		
		JTabbedPane tpMenu = new JTabbedPane(JTabbedPane.TOP);
		tpMenu.setToolTipText("Este es el espacio donde se hace todo el trabajo.");
		tpMenu.setForeground(new Color(0, 0, 0));
		tpMenu.setBackground(new Color(173, 255, 47));
		tpMenu.setFont(new Font("Dialog", Font.BOLD, 15));
		tpMenu.setBounds(37, 136, 778, 479);
		tpMenu.addTab("Resumen", resumen);
		tpMenu.addTab("Inventario", inventario);
		inventario.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblId.setBounds(24, 161, 69, 15);
		inventario.add(lblId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtId.setColumns(10);
		txtId.setBackground(new Color(255, 255, 204));
		txtId.setBounds(63, 156, 108, 27);
		inventario.add(txtId);
		
		JLabel lblRaza = new JLabel("Raza:");
		lblRaza.setFont(new Font("Dialog", Font.BOLD, 16));
		lblRaza.setBounds(26, 201, 69, 15);
		inventario.add(lblRaza);
		
		txtRaza = new JTextField();
		txtRaza.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtRaza.setColumns(10);
		txtRaza.setBackground(new Color(255, 255, 204));
		txtRaza.setBounds(83, 196, 343, 27);
		inventario.add(txtRaza);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSexo.setBounds(26, 241, 69, 15);
		inventario.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtSexo.setColumns(10);
		txtSexo.setBackground(new Color(255, 255, 204));
		txtSexo.setBounds(83, 236, 343, 27);
		inventario.add(txtSexo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTipo.setBounds(26, 280, 69, 15);
		inventario.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtTipo.setColumns(10);
		txtTipo.setBackground(new Color(255, 255, 204));
		txtTipo.setBounds(83, 275, 343, 27);
		inventario.add(txtTipo);
		
		JLabel lblMadre = new JLabel("Madre:");
		lblMadre.setFont(new Font("Dialog", Font.BOLD, 16));
		lblMadre.setBounds(26, 319, 69, 15);
		inventario.add(lblMadre);
		
		txtMadre = new JTextField();
		txtMadre.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtMadre.setColumns(10);
		txtMadre.setBackground(new Color(255, 255, 204));
		txtMadre.setBounds(93, 314, 333, 27);
		inventario.add(txtMadre);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Dialog", Font.BOLD, 16));
		lblFechaNacimiento.setBounds(26, 358, 184, 15);
		inventario.add(lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBackground(new Color(255, 255, 204));
		txtFechaNacimiento.setBounds(215, 353, 211, 27);
		inventario.add(txtFechaNacimiento);
		
		JLabel lblMedicamentos = new JLabel("Medicamentos:");
		lblMedicamentos.setFont(new Font("Dialog", Font.BOLD, 16));
		lblMedicamentos.setBounds(26, 397, 184, 15);
		inventario.add(lblMedicamentos);
		
		txtMedicamentos = new JTextField();
		txtMedicamentos.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtMedicamentos.setColumns(10);
		txtMedicamentos.setBackground(new Color(255, 255, 204));
		txtMedicamentos.setBounds(162, 392, 264, 27);
		inventario.add(txtMedicamentos);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblFoto.setBounds(229, 31, 141, 139);
		inventario.add(lblFoto);
		
		JLabel lblDescripcion_Inventario = new JLabel("Descripción:");
		lblDescripcion_Inventario.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDescripcion_Inventario.setBounds(464, 36, 108, 15);
		inventario.add(lblDescripcion_Inventario);
		
		txtDescripcion_Inventario = new JTextField();
		txtDescripcion_Inventario.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtDescripcion_Inventario.setColumns(10);
		txtDescripcion_Inventario.setBackground(new Color(255, 255, 204));
		txtDescripcion_Inventario.setBounds(464, 61, 275, 114);
		inventario.add(txtDescripcion_Inventario);
		
		JList listInventario = new JList();
		listInventario.setBounds(464, 187, 275, 225);
		inventario.add(listInventario);
		
		tpMenu.addTab("Ingresos", ingresos);
		ingresos.setLayout(null);
		tbIngreso = new JTable();
		tbIngreso.setBounds(12, 12, 749, 424);
		ingresos.add(tbIngreso);
		
		tpMenu.addTab("Egresos", egresos);
		egresos.setLayout(null);
		tbEgresos = new JTable();
		tbEgresos.setBounds(12, 12, 749, 424);
		egresos.add(tbEgresos);
		
		tpMenu.addTab("Contactos", contactos);
		contactos.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 40, 69, 15);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(255, 255, 204));
		txtNombre.setBounds(115, 35, 318, 27);
		txtNombre.setFont(new Font("Dialog", Font.ITALIC, 12));
		contactos.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(33, 79, 89, 15);
		lblApellido.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBackground(new Color(255, 255, 204));
		txtApellido.setBounds(115, 74, 318, 27);
		txtApellido.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtApellido.setColumns(10);
		contactos.add(txtApellido);

		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(33, 118, 89, 15);
		lblDireccion.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblDireccion);
				
		txtDireccion = new JTextArea();
		txtDireccion.setBorder(UIManager.getBorder("TextField.border"));
		txtDireccion.setBackground(new Color(255, 255, 204));
		txtDireccion.setBounds(125, 113, 308, 67);
		txtDireccion.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtDireccion.setColumns(10);
		contactos.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(33, 197, 89, 15);
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBackground(new Color(255, 255, 204));
		txtTelefono.setBounds(115, 192, 318, 27);
		txtTelefono.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtTelefono.setColumns(10);
		contactos.add(txtTelefono);

		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(33, 237, 89, 15);
		lblCelular.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBackground(new Color(255, 255, 204));
		txtCelular.setBounds(104, 232, 329, 27);
		txtCelular.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtCelular.setColumns(10);
		contactos.add(txtCelular);

		JLabel lblFax = new JLabel("Fax:");
		lblFax.setBounds(33, 277, 89, 15);
		lblFax.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblFax);
		
		txtFax = new JTextField();
		txtFax.setBackground(new Color(255, 255, 204));
		txtFax.setBounds(79, 272, 354, 27);
		txtFax.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtFax.setColumns(10);
		contactos.add(txtFax);

		JLabel lblApartadoPostal = new JLabel("Apartado Postal:");
		lblApartadoPostal.setBounds(33, 317, 133, 15);
		lblApartadoPostal.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblApartadoPostal);
		
		txtApartadoPostal = new JTextField();
		txtApartadoPostal.setBackground(new Color(255, 255, 204));
		txtApartadoPostal.setBounds(187, 312, 246, 27);
		txtApartadoPostal.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtApartadoPostal.setColumns(10);
		contactos.add(txtApartadoPostal);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(33, 356, 69, 15);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(255, 255, 204));
		txtEmail.setBounds(104, 351, 329, 27);
		txtEmail.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtEmail.setColumns(10);
		contactos.add(txtEmail);
		
		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setBounds(33, 395, 133, 15);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBackground(new Color(255, 255, 204));
		txtTitulo.setBounds(104, 390, 329, 27);
		txtTitulo.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtTitulo.setColumns(10);
		contactos.add(txtTitulo);
		
		JLabel lblDescripcion_Contactos = new JLabel("Descripción:");
		lblDescripcion_Contactos.setBounds(463, 41, 108, 15);
		lblDescripcion_Contactos.setFont(new Font("Dialog", Font.BOLD, 16));
		contactos.add(lblDescripcion_Contactos);
		
		txtDescripcion_Contactos = new JTextField();
		txtDescripcion_Contactos.setBackground(new Color(255, 255, 204));
		txtDescripcion_Contactos.setBounds(463, 66, 275, 114);
		txtDescripcion_Contactos.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtDescripcion_Contactos.setColumns(10);
		contactos.add(txtDescripcion_Contactos);
		
		JList listContactos = new JList();
		listContactos.setBounds(463, 192, 275, 225);
		contactos.add(listContactos);
		tpMenu.addTab("Eventos", eventos);
		eventos.setLayout(null);
		
		tbEventos = new JTable();
		tbEventos.setBorder(new LineBorder(new Color(51, 102, 0), 3));
		tbEventos.setBounds(296, 30, 448, 390);
		eventos.add(tbEventos);
		
		JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(51, 102, 0), 3, true));
		calendar.setDecorationBordersVisible(true);
		calendar.getYearChooser().getSpinner().setBackground(new Color(204, 255, 51));
		calendar.getMonthChooser().getComboBox().setBackground(new Color(204, 255, 204));
		calendar.getDayChooser().setBackground(new Color(153, 204, 102));
		calendar.getDayChooser().getDayPanel().setBackground(new Color(51, 102, 0));
		calendar.setDecorationBackgroundColor(new Color(204, 255, 153));
		calendar.setBounds(28, 87, 244, 278);
		eventos.add(calendar);
		frmVicusPrincipal.getContentPane().add(tpMenu);
		
		JLabel bg = new JLabel("");
		bg.setHorizontalAlignment(SwingConstants.CENTER);
		bg.setBorder(new LineBorder(new Color(0, 100, 0), 10, true));
		bg.setIcon(new ImageIcon(VicusPrincipal.class.getResource("/img/bg.jpg")));
		bg.setBounds(0, 0, 850, 650);
		frmVicusPrincipal.getContentPane().add(bg);
		frmVicusPrincipal.setLocationRelativeTo(null);
	}
}