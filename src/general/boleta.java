package general;
import java.util.HashMap;
import java.util.Iterator;


public class boleta {
	
	//atributos
	
	private int id;
	private int valor;
	//private int fecha;
	
	//propiedades
	
	public int getId (){
		return id;
		
	}
	
	public void setId( int i){
		id=i;
	}

	public int getValorBoleta(){
		return valor;
		
	}
	
	public void setValorBoleta(int v){
		valor=v;		
	}
	
	/*public Date getFecha(){
		return fecha;
	}
	
	public void setFecha(Date f){
		fecha=f;
	}*/
	//constructor
	
	public boleta (){
		
	}
	
	//metodos
	
	     
    
    public double calcularPasaje(){
    	int total;
    	int cantidad=0;
    	
    	total= valor*cantidad;
    	
    	
    	return total;
    	
    }
    
    
    public static void guardarBoleta(String id, String nombre, HashMap <String,String> listaBoleta){
	    if (listaBoleta.containsKey(id)){
	        System.out.println("No se puede introducir la boleta. El id esta repetido.");
	    }
	    else{
	        listaBoleta.put(id,nombre);               
	    }
	}
	
	public static void mostrarBoleta(HashMap<String, String> listaBoleta){
	    String id;
	    Iterator<String> boleta = listaBoleta.keySet().iterator();
	    System.out.println("Hay los siguientes boletas:");
	    while(boleta.hasNext()){
	        id = boleta.next();
	        System.out.println(id + " - " + listaBoleta.get(id));
	    }        
	}
	


	public static void anularBoleta(String id, HashMap<String,String> listaBoleta){
		if (listaBoleta.containsKey(id)){
        listaBoleta.remove(id);
		}
		else{
			System.out.println("No hay ningun Boleta con ese id.");  
		}       
	} 
	
    
    
    

}

