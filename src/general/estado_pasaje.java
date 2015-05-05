package general;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class estado_pasaje {
	
	//atributos
	private int idestado_pasaje;
	private String estado_pasaje;
	
	//Propiedades
	public int getidestado_pasaje(){
		return idestado_pasaje;
	}
	public void setidestado_pasaje(int id){
		idestado_pasaje = id;
	}
	
	public String getestado_pasaje(){
		return estado_pasaje;
	}
	public void setestado_pasaje(String ep){
		estado_pasaje = ep;
	}
	
	//Constructor
	public estado_pasaje(){
		
	}
	
	
	//Metodos
	
	public ResultSet listarEstadoPasaje( ){
		Conectadb db = new Conectadb();
		 ResultSet rs = null;
		 
		try{
			 db.conectar();
			  rs = db.consulta("SELECT * FROM `estado_pasaje`");
		}catch (Exception e1)
        {
			
        }
		 return rs;
	}
	
	
	public ResultSet BuscarEstadoPasajePorID(int idestado_pasaje ){
		Conectadb db = new Conectadb();
		 ResultSet rs = null;
		 
		try{
			 db.conectar();
			  rs = db.consulta("SELECT * FROM `estado_pasaje` where idestado_pasaje="+ idestado_pasaje +"");
		}catch (Exception e1)
        {
			
        }
		 return rs;
	}	
	
	
	
	
	
	

}
