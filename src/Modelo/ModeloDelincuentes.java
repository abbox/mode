package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloDelincuentes {
	
	public ArrayList<Delincuentes> load(){

		MySql conexion = MySql.getInstance();
		ResultSet resultado = conexion.query("select * FROM Delincuentes");
		
		ArrayList<String> nombresDelincuente = new ArrayList<String>();
		ArrayList<Delincuentes> delincuentes = new ArrayList<Delincuentes>();
		try{
			while(resultado.next()){
				Delincuentes delincuente = new Delincuentes();
				delincuente.setId((int)resultado.getObject("id"));
				delincuente.setNombre((String)resultado.getObject("nombre"));
				delincuente.setEdad((int)resultado.getObject("edad"));
				delincuente.setSexo((String)resultado.getObject("sexo"));
				delincuente.setNacionalidad((String)resultado.getObject("nacionalidad"));
				delincuente.setDireccion((String)resultado.getObject("direccion"));
				delincuente.setPoblacion((String)resultado.getObject("poblacion"));
				delincuente.setAntecedentes((String)resultado.getObject("antecedentes"));
				delincuentes.add(delincuente);
				nombresDelincuente.add(delincuente.getNombre());
			}
		}
		catch(SQLException errorCargaDatos){
			errorCargaDatos.printStackTrace();
		}
		return delincuentes;
	}
	
	public void save(Delincuentes delincuente){
		MySql conexion = MySql.getInstance();
		
	}

}
