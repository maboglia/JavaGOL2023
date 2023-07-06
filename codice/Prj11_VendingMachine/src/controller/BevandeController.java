package controller;

import model.*;


public class BevandeController {

	public static boolean checkMoney(double money, double price) {
			System.out.println("resto: " + (money-price));
			return money >= price;
		
	}
	
	
	public static Bevanda getBevanda(String codice) {
		
		Bevanda b = null;
		
		switch (codice) {
		case "A1":
			b = new Caffe(0.5);
			break;
		case "A2":
			b = new Cioccolata(0.55);
			break;
		case "A3":
			b = new Cappuccino(0.45);
			break;
		case "A4":
			b = new The(0.75);
			break;

		default:
			System.out.println("scelta non disponibile");
			break;
		}
		
		return b;
		
	}
	
}
