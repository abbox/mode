package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public ArrayList<Usuario> load(){
		
		MySql conexion = MySql.getInstance();
		ResultSet resultado = conexion.query("select * FROM usuarios");
		
		ArrayList<String> nombresUsuario = new ArrayList<String>();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			while(resultado.next()){
				Usuario usuario = new Usuario();
				usuario.setId((int)resultado.getObject("id"));
				usuario.setUsuario((String)resultado.getObject("usuario"));
				usuario.setPassword((String)resultado.getObject("pass"));
				usuarios.add(usuario);
				nombresUsuario.add(usuario.getUsuario());
			}
		}
		catch(SQLException errorCargaDatos){
			errorCargaDatos.printStackTrace();
		}
		return usuarios;
	}
	
}
