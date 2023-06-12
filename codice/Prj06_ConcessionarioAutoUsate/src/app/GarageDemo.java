package app;

import model.Automobile;
import model.Garage;

public class GarageDemo {

	public static void main(String[] args) {
		Garage garage1 = new Garage(5);
		
		Automobile a1 = new Automobile("Fiat", "Panda");
		a1.setAnno(2018);
		a1.setKm(56000);
		a1.setPrezzo(4200);

		Automobile a2 = new Automobile("Renault", "Twingo", 2017);
		a2.setPrezzo(5200);
		
		garage1.addAutomobile(a1, 0);
		garage1.addAutomobile(a2, 2);
		
//		System.out.println(garage1.isDisponibile(0));
//		System.out.println(garage1.isDisponibile(1));
		
//		System.out.println(garage1);

		System.out.println(garage1.toHtml());
		
		
		
	}

}
