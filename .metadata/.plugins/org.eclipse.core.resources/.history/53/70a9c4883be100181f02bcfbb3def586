package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDGenerarTicket extends JDialog {
	private JLabel lblNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDGenerarTicket dialog = new JDGenerarTicket();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JDGenerarTicket() {
		setBounds(100, 100, 384, 397);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 49, 46, 14);
		getContentPane().add(lblNombre);

	}

}
