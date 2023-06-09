package gioco;

import model.Dado;

public class TrovaUguali {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		final int partite = 100_000_000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < partite; i++) {
			
			int res1 = d1.lancia();
			int res2 = d2.lancia();
			
			if (res1 == res2) {
				vittorie++;
				//System.out.println("hai vinto con una coppia di " + res1);
			} else {
				//System.out.println("hai perso");
			}
			
		}
		long stop = System.currentTimeMillis();
		double percVittoria = (double)vittorie / partite * 100;
		System.out.println("Hai giocato " + partite + " volte");
		System.out.println("Hai vinto " + vittorie + " volte");
		System.out.println("La precentuale di successo " + percVittoria +"%");
		System.out.println("L'elaborazione è durata: " + (stop-start));
		
	}

}
