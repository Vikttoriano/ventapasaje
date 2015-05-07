package general;

public class tarifario {
	
	private int valor;
	private float peso;
	private int distancia;
	
	
	public int getValor(){
		return valor;
	}
	
	public void setValor(int v){
		valor = v;
	}
	
	public float getPeso(){
		return peso;
	}
	
	public void setPeso(float p){
		peso = p;
	}
	
	public int getDistancia(){
		return distancia;
	}
	
	public void setDistancia(int d){
		distancia = d;
	}
	
	public tarifario(){
		
	}
	
	/*metodo*/
	
	public float calcvalor(int v, double e, int d){
		float total = 0;
		total = (float) ((v*e)*d);
		return total;
	}

}
