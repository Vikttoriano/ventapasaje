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
	
	public boolean listarCiudad(String ciudad){
		Conectadb db = new Conectadb();
		try{
			
			 db.conectar();
			 ResultSet rs = db.consulta("SELECT * FROM `ciudad`");
			 while (rs.next())
			 {
				 System.out.println (rs.getInt ("idciudad") + " " + rs.getString ("nombre_ciudad"));
			 }
		 return true;
		}catch (Exception e1)
        {
           return false;
        }
		
	
	 
	
	}	

}
