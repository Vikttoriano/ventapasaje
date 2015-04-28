package general;

public class cliente {
	
	private String rut;
	private String nombre;
	//private Date fechanac;
	private int fono;
	private String direccion;
	
	public String getRut(){
		return rut;
	}
	
	public void setRut(String r){
		rut = r;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String n){
		nombre = n;
	}
	
	//public Date getFechanac(){
		//return fechanac;
	//}
	
	//public void setFechanac(Date f){
		//fechanac = f;
	//}
	
	public int getFono(){
		return fono;
	}
	
	public void setFono( int t){
		fono = t;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setDireccion(String d){
		direccion = d;
	}
	
	public cliente(){
		
	}

}
