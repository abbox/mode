package Vistas;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

//import Modelo.Delincuente;

public class VistaDelincuentes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	public VistaDelincuentes() {
		setLayout(null);
		
		JList list = new JList();
	/*	Delincuentes delincuentes = new Delincuentes();
		ArrayList<Delincuente> delincuentes = delincuente.load();
		
		List listDelincuentes = new List();
		listDelincuentes.setBounds(23, 49, 139, 60);
		for(int a=0;a<delincuentes.size();a++){
			listDelincuentes.addItem(delincuentes.get(a).getNombre());
		}
		listDelincuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delincuenteSelected = delincuentes.get(listDelincuentes.getSelectedIndex());
				volcarDatosList(delincuenteSelected);
				//AÑADIDO DE PANEL A CARDLAYOUT PASANDOLE COMO PARAMETRO EL DELINCUENTE
				VistaAntecedentes panelAntecedentes = new VistaAntecedentes(ventana,delincuenteSelected);
				ventana.getContentPane().add(panelAntecedentes, "Antecedentes");
			}
		});*/
		//add(listDelincuentes);
		list.setBounds(45, 77, 87, 47);
		add(list);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(222, 44, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(222, 69, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(222, 100, 46, 14);
		add(lblSexo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 125, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(222, 153, 106, 14);
		add(lblNacionalidad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 168, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(222, 195, 72, 14);
		add(lblDireccion);
		
		textField_3 = new JTextField();
		textField_3.setBounds(222, 220, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPoblacion = new JLabel("Poblacion");
		lblPoblacion.setBounds(222, 249, 72, 14);
		add(lblPoblacion);
		
		textField_4 = new JTextField();
		textField_4.setBounds(222, 276, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAntecedentes = new JButton("Antecedentes");
		btnAntecedentes.setBounds(222, 325, 147, 23);
		add(btnAntecedentes);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(362, 44, 46, 14);
		add(lblEdad);
		
		textField_5 = new JTextField();
		textField_5.setBounds(354, 75, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);

	}
	
	/*private void volcarDatosList(Delincuente delincuente){
		Nombre.setText(delincuenteSelected.getNombre());
		edad.setText(String.valueOf(delincuenteSelected.getEdad()));
		sexo.setText(delincuenteSelected.getSexo());
		nacionalidad.setText(delincuenteSelected.getNacionalidad());
		direccion.setText(delincuenteSelected.getDireccion());
		poblacion.setText(delincuenteSelected.getPoblacion());
	}*/
}
