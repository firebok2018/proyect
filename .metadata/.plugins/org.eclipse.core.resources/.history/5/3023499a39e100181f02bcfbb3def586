package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFSsytemRepair extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenu mnConfiguracn;
	private JMenuItem mntmConfiguracinDeMonedas;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnActualizacin;
	private JMenu mnRegistro;
	private JMenuItem mntmProductos;
	private JMenu mnVenta;
	private JMenuItem mntmProductos_1;
	private JMenu mnConsultas;
	private JMenuItem mntmClientes;
	private JMenuItem mntmNewMenuItem_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFSsytemRepair frame = new JFSsytemRepair();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFSsytemRepair() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mnActualizacin = new JMenu("Actualizaci\u00F3n");
		menuBar.add(mnActualizacin);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(this);
		mnActualizacin.add(mntmProductos);
		
		mnRegistro = new JMenu("Registro");
		mnRegistro.addActionListener(this);
		menuBar.add(mnRegistro);
		
		mnVenta = new JMenu("Venta");
		menuBar.add(mnVenta);
		
		mntmProductos_1 = new JMenuItem("Productos");
		mntmProductos_1.addActionListener(this);
		mnVenta.add(mntmProductos_1);
		
		mnConfiguracn = new JMenu("Configurac\u00F3n");
		menuBar.add(mnConfiguracn);
		
		mntmConfiguracinDeMonedas = new JMenuItem("Configuraci\u00F3n de Monedas");
		mntmConfiguracinDeMonedas.addActionListener(this);
		mnConfiguracn.add(mntmConfiguracinDeMonedas);
		
		mntmNewMenuItem = new JMenuItem("Configuraci\u00F3n de Garantia");
		mntmNewMenuItem.addActionListener(this);
		mnConfiguracn.add(mntmNewMenuItem);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(this);
		mnConsultas.add(mntmClientes);
		
		mntmNewMenuItem_1 = new JMenuItem("Facturas");
		mnConsultas.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmClientes) {
			actionPerformedMntmClientes(e);
		}
		if (e.getSource() == mntmProductos_1) {
			actionPerformedMntmProductos_1(e);
		}
		if (e.getSource() == mnRegistro) {
			actionPerformedMnRegistro(e);
		}
		if (e.getSource() == mntmProductos) {
			actionPerformedMntmProductos(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mntmConfiguracinDeMonedas) {
			actionPerformedMntmConfiguracinDeMonedas(e);
		}
	}
	protected void actionPerformedMntmConfiguracinDeMonedas(ActionEvent e) {
		JDConfiidMoney cm= new JDConfiidMoney();
		cm.setLocationRelativeTo(cm);
		cm.setVisible(true);
		
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
	}
	protected void actionPerformedMntmProductos(ActionEvent e) {
		
		JDProductos jdp =new JDProductos();
		jdp.setLocationRelativeTo(jdp);
		jdp.setVisible(true);
	}
	protected void actionPerformedMnRegistro(ActionEvent e) {
		JDRegister jdr= new JDRegister();
		jdr.setLocationRelativeTo(jdr);
		jdr.setVisible(true);
	}
	protected void actionPerformedMntmProductos_1(ActionEvent e) {
		JDVenta jdv= new JDVenta();
		jdv.setLocationRelativeTo(jdv);
		jdv.setVisible(true);
	}
	protected void actionPerformedMntmClientes(ActionEvent e) {
		JDCClientes jcliente= new JDCClientes();
		jcliente.setLocationRelativeTo(jcliente);
		jcliente.setVisible(true);
	}
}
