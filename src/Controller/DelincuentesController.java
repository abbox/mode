package Controller;

import javax.swing.JOptionPane;

import Modelo.Delincuentes;
import Modelo.MySql;

public class DelincuentesController {

	private Delincuentes delincuente;
	
	public DelincuentesController() {
		// TODO Auto-generated constructor stub
	}
	
	public void setDelincuente(Delincuentes d){
		this.delincuente=d;
	}
	
	public void guardarAntecedentes(String antecedentes){
		MySql conexion = MySql.getInstance();
		conexion.modifyQuery("UPDATE delincuentes SET antecedentes='"+antecedentes+"' where id="+this.delincuente.getId()+";");
		JOptionPane.showMessageDialog(null, "Antecedentes almacenados correctamente.");
	}
}
