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
	private JTable tbIngreso;
	private JTable tbEgresos;
	private JTable table;
	private JTable table_1;

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
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 128, 0), 3));
		table_1.setBounds(12, 12, 749, 424);
		inventario.add(table_1);
		
		tpMenu.addTab("Ingresos", ingresos);
		ingresos.setLayout(null);
		tbIngreso = new JTable();
		tbIngreso.setBorder(new LineBorder(new Color(0, 128, 0), 3));
		tbIngreso.setBounds(12, 12, 749, 424);
		ingresos.add(tbIngreso);
		
		tpMenu.addTab("Egresos", egresos);
		egresos.setLayout(null);
		tbEgresos = new JTable();
		tbEgresos.setBorder(new LineBorder(new Color(0, 128, 0), 3));
		tbEgresos.setBounds(12, 12, 749, 424);
		egresos.add(tbEgresos);
		
		tpMenu.addTab("Contactos", contactos);
		contactos.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 128, 0), 3));
		table.setBounds(12, 12, 749, 424);
		contactos.add(table);
		tpMenu.addTab("Eventos", eventos);
		eventos.setLayout(null);
		
		tbEventos = new JTable();
		tbEventos.setBorder(new LineBorder(new Color(0, 128, 0), 3));
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