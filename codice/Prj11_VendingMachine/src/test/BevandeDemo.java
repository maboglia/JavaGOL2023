package test;

import java.util.ArrayList;

import model.Bevanda;
import model.Caffe;
import model.Cappuccino;
import model.Cioccolata;
import model.The;

public class BevandeDemo {

	public static void main(String[] args) {

//		Bevanda b = new Caffe(0.5);
//		Bevanda b1 = new Cioccolata(0.45);
//		Bevanda b2 = new The(0.6);
//		Bevanda b3 = new Cappuccino(0.75);
		
		ArrayList<Bevanda> bevande = new ArrayList<>();
		
		bevande.add(new Caffe(0.5));
		bevande.add(new Cioccolata(0.45));
		bevande.add(new The(0.6));
		bevande.add(new Cappuccino(0.75));
		
		for (Bevanda bevanda : bevande) {
			bevanda.prepara();
			System.out.println(bevanda);
		}
		
		

	}

}
