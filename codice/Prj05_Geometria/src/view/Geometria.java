package view;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class Geometria {

	public static void main(String[] args) {
		
		Punto a = new Punto(2, 2);
		Punto b = new Punto(6, 2);
		Punto c = new Punto(2, 5);
		
		Segmento ab = new Segmento(a, b); 
		Segmento ac = new Segmento(a, c);
		Segmento bc = new Segmento(b, c);
		
		
		Triangolo t1 = new Triangolo(a, b, c); 
		
		Rettangolo r1 = new Rettangolo(ab, ac);//4*3
		
		Quadrato q1 = new Quadrato(ab);
		System.out.println(q1.calcolaPerimetro());
		System.out.println(q1.calcolaArea());
		System.out.println(q1);
		
		
//		System.out.println(a);
//		System.out.println(b);
//		
//		System.out.println(ab.calcolaLunghezza());
//		System.out.println(ac.calcolaLunghezza());
//		System.out.println(bc.calcolaLunghezza());
		
//		System.out.println(a.x);
//		System.out.println(a.y);
//		
//		System.out.println(b.x);
//		System.out.println(b.y);
		
		
	}

}
