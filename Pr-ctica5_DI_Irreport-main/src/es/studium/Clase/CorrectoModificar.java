package es.studium.Clase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Creamos un mensaje de confiramaci�n de que la modificaci�n se ha realizado
 * correctamente
 * 
 * @author Mois�s Adamuz
 *
 */
public class CorrectoModificar extends JFrame {

	private JPanel contentPane;

	/**
	 * Dise�amos la interfaz
	 */
	public CorrectoModificar() {
		setTitle("Correcto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u00A1El art\u00EDculo ha sido modificado con \u00E9xito!");
		lblNewLabel.setBounds(27, 34, 247, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(89, 72, 89, 30);
		contentPane.add(btnNewButton);
	}

}
