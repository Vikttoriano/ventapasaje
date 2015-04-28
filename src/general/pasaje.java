package general;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class pasaje {
	
	//Atributos
	private int id_pasaje;
	private String ciudad_origen_pasaje;
	private String ciudad_destino_pasaje;
	//private Date fecha_pasaje;
	private int precio_pasaje;
	private int asiento_pasaje;
	//idservicio
	//rut_cliente
	//estado_pasaje
	
	
	
	//Propiedades
	
	public int getid_pasaje(){
		return id_pasaje;
	}
	public void setid_pasaje(int ip){
		id_pasaje = ip;
	}
	
	
	public String getciudad_origen_pasaje(){
		return ciudad_origen_pasaje;
	}
	public void setciudad_origen_pasaje(String cop){
		ciudad_origen_pasaje = cop;
	}
	
	
	public String getciudad_destino_pasaje(){
		return ciudad_destino_pasaje;
	}
	public void setciudad_destino_pasaje(String cdp){
		ciudad_destino_pasaje = cdp;
	}
	
	
	
	public int getprecio_pasaje(){
		return precio_pasaje;
	}
	public void setprecio_pasaje(int pp){
		precio_pasaje = pp;
	}
	
	
	public int getasiento_pasaje(){
		return asiento_pasaje;
	}
	public void setasiento_pasaje(int ap){
		asiento_pasaje = ap;
	}
	
	
	
	//Constructor
	
	public pasaje(){
		
	}
	
	
	
	//Metodos
	
	public void crearPasaje(int id, int asiento, Map<Integer,Integer> listaPasaje){
		listaPasaje.put(id_pasaje, asiento_pasaje);
	}
	
	
	public void modificarPasaje(int id, int asiento, HashMap<Integer, Integer> listaPasajes){
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce la id del pasaje");
		listaPasajes.put(id, teclado.nextInt());
		
		System.out.println("Introduce el numero del asiento");
		listaPasajes.put(asiento, teclado.nextInt());
	
		
		
	}
	
	
	
	
	
	
	
	public void EliminarPasaje(int pasaje, Map<Integer, Integer> ListaPasaje){
		if(ListaPasaje.containsKey(pasaje)){
			ListaPasaje.remove(pasaje);
		}
		else{
			System.out.println("Error, pasaje no esta registrado");
		}
	}
	
	
	

}
