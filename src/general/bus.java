package general;

import java.sql.SQLException;
import java.sql.ResultSet;
public class bus {
//ATRIBUTOS
	String matricula_bus;
	int numero_bus=0,numero_asiento_bus=0,cap_carga_bus=0;
	Conectadb cdb=new Conectadb();
	
//PROPIEDADES
	public String getMatriBus(){
		return matricula_bus;
	}
	public void setMatriBus(String mb){
		matricula_bus=mb;
	}
	public int getNumBus(){
		return numero_bus;
	}
	public void setNumBus(int nb){
		numero_bus=nb;
	}
	public int getNumAsientoBus(){
		return numero_asiento_bus;
	}
	public void setNumAsientoBus(int nab){
		numero_asiento_bus=nab;
	}
	public int getCCargaBus(){
		return cap_carga_bus;
	}
	public void setCCargaBus(int ccb){
		cap_carga_bus=ccb;
	}
//CONSTRUCTOR
	public bus(){}
//METODOS
	public ResultSet ListarBus(String lbus){
		ResultSet rs = null;
		try{
			cdb.conectar();
			  rs =cdb.consulta("SELECT * FROM bus");
			 while(rs.next()){
				 System.out.println (rs.getInt ("matricula_bus") + " " + rs.getString (" numero_bus "+" num_asiento_bus "+" capacidad_carga_bus "));
			 }
			 return rs;
		}catch(SQLException ex){
			 return rs;
		}
	}
	public ResultSet BuscarBus(String mbus){
		ResultSet rs= null;
		try{
			cdb.conectar();
			rs = cdb.consulta("SELECT * FROM bus WHERE matricula_bus="+mbus+"");
			return rs;
		}catch(SQLException ex){
			return rs;
		}
	 
	};
	public boolean CrearBus(String matricula,int numeroB,int asientoB,int capacidadC,String tb){
		String ConsultaSQL ="INSERT INTO bus (matricula_bus, numero_bus, num_asiento_bus, capacidad_carga_bus, tipo_bus_idtipo_bus)"
							+" VALUES ('"+matricula+ "','"+numeroB+"',"+"'"+asientoB+"',"+"'"+capacidadC+"',"+"'"+tb+"')";
		System.out.println(ConsultaSQL);
		try{
			cdb.conectar();
			cdb.insertar(ConsultaSQL);
			return true;
		}catch(SQLException ex){
		return false;}
	}

	public static void EliminarBus(){
		
	};
	public static void EditarBus(){
	};
	public static String TipoBus(String n){
		String tipobus = null;
		return tipobus;
	};
}
