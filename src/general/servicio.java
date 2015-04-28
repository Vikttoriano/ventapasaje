package general;
import java.util.HashMap;
import java.util.Iterator;


public class servicio {
	
	// atributos
	
	
	
	private int id;
	private String tipo;
	private String matricula;
	
	
	//Instanciar atributos
	//private String idCiuOrig;
	//private String idCiuDes;
	//private int idEstSer;
	//private Date Fecha;
	
	
	//propiedades
	
	public int getId (){
		return id;
		
	}
	
	public void setId( int i){
		id=i;
	}

	public String getTipo(){
		return tipo;
		
	}
	
	public void setTipo(String t){
		tipo=t;		
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String m){
		matricula=m;
	}
	
	
	//constructor
	
	public servicio (){
		
		
	}
	
	//metodos
	
	public static void guardarServicio(String id, String nombre, HashMap <String,String> listaServicio){
	    if (listaServicio.containsKey(id)){
	        System.out.println("No se puede introducir el servicio. El id esta repetido.");
	    }
	    else{
	        listaServicio.put(id,nombre);               
	    }
	}
	
	public static void mostrarServicio(HashMap<String, String> listaServicio){
	    String id;
	    Iterator<String> servicio = listaServicio.keySet().iterator();
	    System.out.println("Hay los siguientes Servicios:");
	    while(servicio.hasNext()){
	        id = servicio.next();
	        System.out.println(id + " - " + listaServicio.get(id));
	    }        
	}
	
	
	

}
