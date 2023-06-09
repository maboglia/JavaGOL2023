package model;

public class Triangolo {

	Punto a, b, c;
	Segmento ab, ac, bc;

	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	
	}

	public double calcolaPerimetro() {
		
		return 	ab.calcolaLunghezza() + 
				ac.calcolaLunghezza() + 
				bc.calcolaLunghezza();
	}
	
	public double calcolaArea() {
		
		double sp = this.calcolaPerimetro() / 2;
		
		return Math.sqrt(
				 sp *
				(sp - ab.calcolaLunghezza()) *          
				(sp - ac.calcolaLunghezza()) *          
				(sp - bc.calcolaLunghezza())           
				
				);
	}
	
	
	@Override
	public String toString() {
		return "Triangolo [ab=" + ab + ", ac=" + ac + ", bc=" + bc + "]";
	}
	
	
	
}
