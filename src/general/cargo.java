package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class cargo {
	
	tarifario t = new tarifario();
	
	private int id_cargo;
	
	private float tarifa = t.calcvalor(v, p, d);
	
	public int getId_cargo(){
		return id_cargo;
	}
	
	public void setId_cargo(int i){
		id_cargo = i;
	}
	
	public cargo(){
		
	}
	
	public HashMap<String, String> listacargo =new HashMap<String, String>();
	
	
	
	public void mostrarcargo(HashMap<String,String>listaEquipo){
		String nombre;
		Iterator<String> listado=listacargo.keySet().iterator();
		System.out.println("Lista Cargo");
		while(listado.hasNext()){
			nombre=listado.next();
			System.out.println("Cargo: "+ nombre );	
		}
	}
	
	public void EliminarEquipo(String listado, Map<String, String> listaEquipo){
		if(listacargo.containsKey(listado)){
			listacargo.remove(listado);
		}
		else{
			System.out.println("Error, Cargo no esta registrado");
		}
	}

}
