package model;

public class Punto {

	public int x, y;
	
	/**
	 * Costruttore del Punto
	 * @param x - passare come primo parametro il valore di x di questo p
	 * @param y - passare come secondo parametro il valore di y di questo p
	 */
	public Punto(int x, int y) {//parametri formali
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y +")";
	}
	
}
