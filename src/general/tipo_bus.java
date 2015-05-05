package general;

import java.sql.SQLException;

import java.sql.ResultSet;

public class tipo_bus {
//ATRIBUTOS
	int id_tipobus=0;
	String tipobus;
	Conectadb cbd= new Conectadb();
//PROPIEDADES
	public int getIDTipBus(){
		return id_tipobus;
	}
	public void setIDTipBus(int id){
		id_tipobus=id;
	}
	public String getTBus(){
		return tipobus;
	}
	public void setTBus(String tb){
		tipobus=tb;
	}
//CONSTRUCTOR
	public tipo_bus(){}
//METODOS
	public ResultSet ListarTipoBus(String TIB){
		ResultSet rs = null;
		try{
			cbd.conectar();
			  rs =cbd.consulta("SELECT * FROM tipo_bus");
			  
			 while(rs.next()){
				 System.out.println (rs.getInt ("idtipo_bus") + " " + rs.getString ("tipo_bus"));
			 }
			 return rs;
		}catch(SQLException ex){
			 return rs;
		}
	};
	
	public ResultSet BuscarTipoBus(String id){
		ResultSet rs = null;
		try{
			cbd.conectar();
			  rs = cbd.consulta("SELECT * FROM tipo_bus WHERE idtipo_bus = "+id+";");
			 return rs;
		}catch(SQLException ex){
			return rs;
		}
		
	};
	
	public boolean Ingresar(String tipo_bus){
		
		String consulta="INSERT INTO tipo_bus (tipo_bus) VALUES('" + tipo_bus + "');";
		
		try{
			cbd.conectar();
			cbd.insertar(consulta);
			return true;
		}catch(SQLException e){
			return false;
		}
		
	}
}
