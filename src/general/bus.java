package general;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

public class bus {
//ATRIBUTOS
	String matricula_bus;
	int numero_bus=0,numero_asiento_bus=0,cap_carga_bus=0;
	Conectadb cbd= new Conectadb();
	
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
	public boolean ListarBus(String lbus){
		try{
			cbd.conectar();
			 ResultSet rs = (ResultSet) cbd.consulta("SELECT * FROM bus");
			 while(rs.next()){
				 System.out.println (rs.getInt ("matriula_bus") + " " + rs.getString (" numero_bus "+" num_asiento_bus "+" capacidad_carga_bus "));
			 }
		 return true;
		}catch(SQLException ex){
			return false;
		}
	};
	public static String BuscarBus(String tip){
		String lista = null;
		return lista;
	};
	public static void CrearBus(){
		
	};
	public static void EliminarBus(){
	};
	public static void EditarBus(){
	};
	public static String TipoBus(String n){
		String tipobus = null;
		return tipobus;
	};
}
