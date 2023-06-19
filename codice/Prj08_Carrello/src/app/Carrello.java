package app;

import controller.ProdottoCtrl;
import model.Prodotto;

public class Carrello {

	public static void main(String[] args) {

		int posti = MioScanner.leggiInt("Scontrino da quanti prodotti?");
		
		ProdottoCtrl ctrl = new ProdottoCtrl(posti);
		
		for (int i = 0; i < posti; i++) {
			
			String nome = MioScanner.leggiStringa("Nome prodotto?");
			String codice = MioScanner.leggiStringa("Codice prodotto?");
			double prezzo = MioScanner.leggiDouble("Prezzo prodotto");
			Prodotto p = new Prodotto(codice, nome, prezzo); 
			ctrl.addProdotto(p);
		}
		
		System.out.println("Il carrello contiene");
		System.out.println(ctrl.stampa());
	}

}
