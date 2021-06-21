package es.studium.Clase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Di�amos la interfaz que declara un error en la baja
 * 
 * @author Mois�s Adamuz
 *
 */
public class ErrorBaja extends JFrame {

	private JPanel contentPane;

	/**
	 * Dise�amos la interfaz
	 */
	public ErrorBaja() {
		setTitle("Error");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 284, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u00A1No se ha podido dar de baja!");
		lblNewLabel.setBounds(49, 11, 209, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(88, 55, 89, 23);
		contentPane.add(btnNewButton);
	}

}
