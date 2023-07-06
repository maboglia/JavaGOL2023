package view;

import java.util.Scanner;

import controller.BevandeController;
import model.Bevanda;

public class BevandeView {

	public static String[] bevandeDisponibili = {
			"A1 - Caffé",
			"A2 - Cioccolata",
			"A3 - Cappuccino",
			"A4 - The",
	};
	
	public final static String MSG_INPUT = "Scegliere una bevanda";
	public final static String MSG_SOLDINI = "Inserire credito";
	public final static String MSG_PREPARAZIONE = "Bevanda in preparazione";
	public final static String MSG_OUTPUT = "Bevanda pronta. Prelevare bevanda.";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(menu());
		System.out.println(MSG_INPUT);
		String codice = sc.nextLine();
		System.out.println(MSG_SOLDINI);
		double soldi = sc.nextDouble();
		boolean autorizza = BevandeController.checkMoney(soldi, 0.45);
		
		if (autorizza) {
			System.out.println(MSG_PREPARAZIONE);
			Bevanda bevandaScelta = BevandeController.getBevanda(codice);
			bevandaScelta.prepara();
			System.out.println(MSG_OUTPUT);
		} else {
			
		}

		
		

	}
	
	public static String menu() {
		String s = "Elenco bevande disponibili: \n";
		for (String bevanda : bevandeDisponibili) {
			s += bevanda + "\n";
		}
		
		return s;
	}
	

}
