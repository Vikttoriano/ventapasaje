package general;

import java.sql.ResultSet;


public class cargo {
	
	tarifario t = new tarifario();
	
	servicio s = new servicio();
	
	cliente c = new cliente();
	
	boleta b = new boleta();
	
	estado_cargo ec = new estado_cargo();
	
	private int id_cargo;
	
	private int id_estado_cargo;
	
	private int id_servicio;
	
	private String rut_cliente;
	
	private int id_boleta;
	
	private double tarifa = t.calcvalor(t.getValor(), t.getPeso(), t.getDistancia());
	
	
	
	public int getId_cargo(){
		return id_cargo;
	}
	
	public void setId_cargo(int i){
		id_cargo = i;
	}
	
	public cargo(){
		
	}
	/*listar*/
	public ResultSet listarCargo (){
		Conectadb db = new Conectadb();
		ResultSet rs= null;
		try{
			db.conectar();
				rs = db.consulta("SELECT * FROM `cargo`");
		}catch (Exception e1)
		{
			
		}
		return rs;	
	}
	
	/*eliminar*/
	public boolean eliminarCargo(){
		Conectadb db = new Conectadb();
		try{
			db.conectar();
			db.borrar("DELETE * FROM `cargo`");
			return true;
		}
		catch (Exception err){
			return false;
		}
	}
	
	/*buscar*/
	public boolean BuscarCargo(int idcargo){
		Conectadb db = new Conectadb();
		try{
			db.conectar();
			db.consulta("SELECT * FROM `cargo`WHERE idcargo=" + idcargo+" ");
			return true;
		}
		catch (Exception err){
			return false;
		}
	}
	
	

}
