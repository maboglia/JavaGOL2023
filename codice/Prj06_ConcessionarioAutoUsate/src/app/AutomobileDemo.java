package app;

import model.Automobile;

public class AutomobileDemo {

	public static void main(String[] args) {
		Automobile a1 = new Automobile("Fiat", "Panda");
		a1.setAnno(2018);
		a1.setKm(56000);
		a1.setPrezzo(4200);

		Automobile a2 = new Automobile("Renault", "Twingo", 2017);
		a2.setPrezzo(5200);
		
//		System.out.println(a1);
//		System.out.println(a2);
		
		Automobile[] garage = new Automobile[5];
		garage[0] = a1;
		garage[3] = a2;
		
		for (Automobile automobile : garage) {
			System.out.println(automobile);
		}
		
	}

}
