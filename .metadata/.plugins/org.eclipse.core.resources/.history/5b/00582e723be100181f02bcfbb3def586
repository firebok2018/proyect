package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLayeredPane;

public class JDRegister extends JDialog implements ActionListener {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNumCliente;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JButton btnModificar;
	private JComboBox cboTipServicio;
	private JCheckBox cboTipSubServi;
	private JTable tbListaCliente;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDRegister dialog = new JDRegister();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDRegister() {
		setBounds(100, 100, 848, 583);
		getContentPane().setLayout(null);
		
			JLabel lblResgistroDelCliente = new JLabel("Registro del Cliente");
			lblResgistroDelCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblResgistroDelCliente.setBounds(21, 32, 201, 24);
			getContentPane().add(lblResgistroDelCliente);
		
		
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(41, 102, 75, 14);
			getContentPane().add(lblNombre);
		
		
			txtNombre = new JTextField();
			txtNombre.setBounds(126, 99, 265, 20);
			getContentPane().add(txtNombre);
			txtNombre.setColumns(10);
		
		
			JLabel lblApeliido = new JLabel("Apeliido:");
			lblApeliido.setBounds(41, 130, 75, 14);
			getContentPane().add(lblApeliido);
		
		
			txtApellido = new JTextField();
			txtApellido.setBounds(126, 127, 265, 20);
			getContentPane().add(txtApellido);
			txtApellido.setColumns(10);
		
		
			txtNumCliente = new JTextField();
			txtNumCliente.setEnabled(false);
			txtNumCliente.setBounds(126, 67, 86, 20);
			getContentPane().add(txtNumCliente);
			txtNumCliente.setColumns(10);
		
		
			JLabel lblN = new JLabel("COD N\u00BA");
			lblN.setBounds(44, 67, 46, 24);
			getContentPane().add(lblN);
		
		
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(41, 164, 86, 14);
			getContentPane().add(lblTelefono);
		
		
			txtTelefono = new JTextField();
			txtTelefono.setBounds(126, 158, 123, 20);
			getContentPane().add(txtTelefono);
			txtTelefono.setColumns(10);
		
		
			JLabel lblDni = new JLabel("DNI:");
			lblDni.setBounds(233, 70, 46, 14);
			getContentPane().add(lblDni);
		
		
			txtDNI = new JTextField();
			txtDNI.setBounds(278, 67, 113, 20);
			getContentPane().add(txtDNI);
			txtDNI.setColumns(10);
		
		
			JLabel lblTipoDeServicio_1 = new JLabel("Tipo de servicio:");
			lblTipoDeServicio_1.setBounds(498, 70, 113, 14);
			getContentPane().add(lblTipoDeServicio_1);
			
			
		
		
			JLabel lblSerivicio = new JLabel("Servicio");
			lblSerivicio.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblSerivicio.setBounds(445, 32, 201, 24);
			getContentPane().add(lblSerivicio);
		
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(348, 220, 89, 23);
			getContentPane().add(btnModificar);
			
			JButton btnSalir = new JButton("Salir");
			btnSalir.setBounds(468, 220, 89, 23);
			getContentPane().add(btnSalir);
			
			tbListaCliente = new JTable();
			tbListaCliente.setFillsViewportHeight(true);
			tbListaCliente.setBounds(28, 285, 776, 248);
			getContentPane().add(tbListaCliente);
			
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(203, 220, 89, 23);
			getContentPane().add(btnRegistrar);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(621, 67, 123, 20);
			getContentPane().add(comboBox);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(621, 99, 123, 20);
			getContentPane().add(comboBox_1);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnActualizar(arg0);
		}
	}
	protected void actionPerformedBtnActualizar(ActionEvent arg0) {
	}
}
