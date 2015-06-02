package Vistas;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import Modelo.Delincuentes;
import Modelo.ModeloDelincuentes;


public class VistaPrincipal extends JPanel {
	private JTextField textField;
	private JComboBox<String> comboBox;
	
	public VistaPrincipal() {
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(52, 52, 46, 14);
		add(lblUsuario);
		
		
		ModeloDelincuentes md = new ModeloDelincuentes();
		ArrayList<Delincuentes> nombresDelincuente = md.load();
		
		
		JComboBox comboBox = new JComboBox(nombresDelincuente.toArray());
		comboBox.setBounds(52, 77, 85, 20);
		add(comboBox);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(52, 108, 68, 14);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(52, 126, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(52, 180, 89, 23);
		add(btnLogin);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBounds(52, 216, 89, 23);
		add(btnLogout);

	}
}
