package general;
import java.util.HashMap;
import java.util.Iterator;


public class estadoServicio {
	
	    // atributos
	
		private int id;
		private String estado;
		
		//propiedades
		
		public int getId (){
			return id;
		}
		
		public void setIdEst ( int i){
			id=i;
		}
		
		public String getEstado(){
			return estado;
		}
		
		public void setEstadoSer( String es){
			estado=es;
		}
		
		//constructor
		
		public estadoServicio(){
		
		}
		
		
		//metodos
		
		public static void guardarEstado(String id, String estado, HashMap <String,String> listaEstado){
		    if (listaEstado.containsKey(id)){
		        System.out.println("No se puede introducir el estado. El id esta repetido.");
		    }
		    else{
		        listaEstado.put(id, estado);               
		    }
		}
		
		public static void mostrarEstado(HashMap<String, String> listaEstado){
		    String id;
		    Iterator<String> estado = listaEstado.keySet().iterator();
		    System.out.println("Hay los siguientes estados:");
		    while(estado.hasNext()){
		        id = estado.next();
		        System.out.println(id + " - " + listaEstado.get(id));
		    }        
		}
		


		public static void eliminaEstado(String id, HashMap<String,String> listaEstado){
			if (listaEstado.containsKey(id)){
            listaEstado.remove(id);
			}
			else{
				System.out.println("No hay ningun estado con ese id.");  
			}       
		} 
		
}
