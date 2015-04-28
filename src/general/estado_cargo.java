package general;

public class estado_cargo {
//ATRIBUTOS
	int id_estado_cargo=0;
	String estado_cargo;
//PROPIEDADES
	public int getIdEstadoCargo(){
		return id_estado_cargo;
	}
	public void setIdEstadoCargo(int id){
		id_estado_cargo=id;
	}
	public String getEstadoCargo(){
		return estado_cargo;
	}
	public void setEstadoCargo(String ec){
		estado_cargo=ec;
	}
//CONSTRUCTOR
	public estado_cargo(){}
//METODOS
	public static String ListarECargo(String n){
		String lista = null;
		return lista;
	};
	public static String BuscarECargo(String n){
		String lista = null;
		return lista;
	};
}
