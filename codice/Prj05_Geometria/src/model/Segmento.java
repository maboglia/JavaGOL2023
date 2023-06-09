package model;

public class Segmento {

	Punto a, b;

	/**
	 * Costruttore del Segmento
	 * @param a punto A
	 * @param b punto B
	 */
	public Segmento(Punto a, Punto b) {
		
		this.a = a;
		this.b = b;
	}

	public double calcolaLunghezza() {
		return Math.sqrt(//radice  
					Math.pow( (a.x - b.x)   , 2) //quadrato diff x
					+ 
					Math.pow( (a.y - b.y)   , 2) //quadrato diff y                 
				);//chiude sqrt
	}
	
	
	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]";
	}
	
	
	
}
