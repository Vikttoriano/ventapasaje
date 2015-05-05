package general;
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
	
	
	
	
	
	
	
	public void agregarCiudad(String ciudad,int id, Map<String, Integer> listaCiudad){
		listaCiudad.put(nombre_ciudad,id_ciudad);
	}
	
<<<<<<< HEAD
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
	 
=======
	public void listarCiudad(HashMap<String,Integer>ListaCiudad){
		String nombre;
		Iterator<String> ciudad=ListaCiudad.keySet().iterator();
		System.out.println("Lista de Ciudades");
		while(ciudad.hasNext()){
			nombre=ciudad.next();
			System.out.println("Ciudad: "+ nombre + "\nId: " + ListaCiudad.get(nombre));
			
		}
	}
	
	
	
>>>>>>> parent of c1830c7... pruebaCiudad

}
