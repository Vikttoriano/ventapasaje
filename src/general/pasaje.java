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
	
	public boolean agregarPasaje(String ciudadO, String ciudadD, String FechaP, int precio, int asiento, int idestadoP, int boleta, String cliente, int idservicio){
		Conectadb  db = new Conectadb();
		try {
		db.conectar();
		String sql = "INSERT INTO `pasaje` (`idpasaje`, `ciudad_origen`, `ciudad_destino`, fecha_pasaje, `precio_pasaje`, `asiento_pasaje`, `estado_pasaje_idestado_pasaje`, `boleta_idboleta`, `cliente_rut_cliente`, `servicio_idservicio`) VALUES (NULL, '"+ciudadO+"', '"+ciudadD+"', '"+FechaP+"', '"+precio+"', '"+asiento+"', '"+idestadoP+"', '"+boleta+"', '"+cliente+"', '"+idservicio+"') ";
		//System.out.println(sql);
		db.insertar(sql);
		return true;
		}catch (Exception er){
			return false;
		}
		
	}
	
	
	public boolean modificarPasaje(int idpasaje, String ciudadO, String ciudadD, String fechaP, int precio, int asiento, int idestadoP, int boleta, String cliente, int idservicio){
		Conectadb  db = new Conectadb();
		
		try {
		
		db.conectar();
		String sql = "UPDATE `pasaje` SET `ciudad_origen`='"+ciudadO+"' ,`ciudad_destino`='"+ciudadD+"',`fecha_pasaje`='"+fechaP+"',`precio_pasaje`='"+precio+"',`asiento_pasaje`='"+asiento+"',`estado_pasaje_idestado_pasaje`='"+idestadoP+"',`boleta_idboleta`='"+boleta+"',`cliente_rut_cliente`='"+cliente+"',`servicio_idservicio`='"+idservicio+"' where `idpasaje`="+idpasaje+" ";
		db.actualizar(sql);
		return true;
		}catch (Exception er){
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean EliminarPasaje(){
		Conectadb  db = new Conectadb();
		
		
		try {
		db.conectar();
		String sql = "SELECT * FROM `pasaje`";
		db.borrar(sql);
		return true;
		}catch (Exception er){
			
		}
		return false;
	}
	
	
	

}
