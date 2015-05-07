package general;

import java.sql.ResultSet;
import java.sql.SQLException;

public class estado_cargo {
//ATRIBUTOS
	int id_estado_cargo=0;
	String estado_cargo;
//PROPIEDADES
	public int getIdEstadoCargo(){
		return id_estado_cargo;
	}
	public void setIdEstadoCargo(int id){
		id_estado_cargo=id;
	}
	public String getEstadoCargo(){
		return estado_cargo;
	}
	public void setEstadoCargo(String ec){
		estado_cargo=ec;
	}
//CONSTRUCTOR
	public estado_cargo(){}
//METODOS
	public ResultSet ListarECargo(String n){
		ResultSet rs=null;
		return rs;
	};
	public static String BuscarECargo(String n){
		String lista = null;
		return lista;
	}
	public boolean insertar_cargo(String estado_cargo){
		try
		{
			Conectadb db = new Conectadb();
			db.conectar();
			db.insertar("INSERT INTO `estado_cargo`"
					+ " (`idestado_cargo`, `estado_cargo`) VALUES "
					+ "(NULL, '"+estado_cargo+"');");
			return true;
		}catch(SQLException e){
			
			return false;
		}
		
	}
		
		
		
		
		
	
}
