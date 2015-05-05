package general;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class ciudad {

	//Atributos
	
	private int id_ciudad;
	private String nombre_ciudad;
	
	
	//Propiedades
	public int getid_ciudad(){
		return id_ciudad;
	}
	public void setid_ciudad(int ic){
		id_ciudad = ic;
	}
	
	
	public String getnombre_ciudad(){
		return nombre_ciudad;
	}
	public void setnombre_ciudad(String nc){
		nombre_ciudad = nc;
	}
		
		
	//Constructor
	public ciudad(){
			
	}
	
	
	
	//Metodos
	
	//Buscar Ciudad
	
	
	
	
	
	
	
	public boolean agregarCiudad(String ciudad){
		Conectadb  db = new Conectadb();
		
		try {
		db.conectar();
		db.insertar("INSERT INTO `ciudad`" + " (`idciudad`, `nombre_ciudad`) VALUES "
				+ "(NULL, '"+ciudad+"');");
		return true;
		}catch (Exception err){
			return false;
		}
		
	}
	
	public ResultSet listarCiudad( ){
		Conectadb db = new Conectadb();
		 ResultSet rs = null;
		 
		try{
			 db.conectar();
			  rs = db.consulta("SELECT * FROM `ciudad`");
		}catch (Exception e1)
        {
			
        }
		 return rs;
	}	
	
	
	  	public ResultSet BuscarCiudadPorID(int idciudad ){
		Conectadb db = new Conectadb();
		 ResultSet rs = null;
		 
		try{
			 db.conectar();
			  rs = db.consulta("SELECT * FROM `ciudad` where idciudad="+ idciudad +"");
		}catch (Exception e1)
        {
			
        }
		 return rs;
	}	
	 

}
