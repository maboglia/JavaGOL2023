package collezioni;

import java.util.ArrayList;
import java.util.List;

public class PrvoaListe {

	public static void main(String[] args) {

		List<String> giorni = new ArrayList<>();
		
		giorni.add("Lunedì");
		giorni.add("Martedì");
		giorni.add("Mercoledì");
		giorni.add("Giovedì");
		giorni.add("Venerdì");
		giorni.add("Sabato");
		giorni.add("Domenica");
//		giorni.add(7);
		
		for (Object giorno : giorni) {
			if(giorno instanceof String)
				System.out.println(((String) giorno).toUpperCase());
			else
				System.out.println("Numero giorni " + giorno);
		}
		
		

	}

}
