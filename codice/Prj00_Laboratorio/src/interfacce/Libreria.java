package interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorePrezzo implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		
		return Double.compare(libro1.prezzo, libro2.prezzo);
	}
	
}




public class Libreria {
	
	public static void main(String[] args) {
		
		
		List<Libro> libri = new ArrayList<>();
		
		libri.add(new Libro(1, "Siddharta", 10.0));
		libri.add(new Libro(2, "Rapture", 15.0));
		libri.add(new Libro(3, "Alba Chiara", 9.50));
		libri.add(new Libro(4, "Zanna Bianca", 20.0));
		libri.add(new Libro(5, "Darksiders", 13.30));
		
		//ComparatorePrezzo cp = new ComparatorePrezzo();
		//Comparator<Libro> cp = (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo);
			
			
		
		 
		//Collections.sort(libri, (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo));//la mia collezione è stata riodinata; NON è progrmmazione funzionale qui
		
		
		libri
			.stream()//con stream posso scorrere la collezione
			.sorted((libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo))//la collezione viene riordinata qui dentro ma NON cambia fuori
			.filter(l -> l.prezzo < 15)
			.forEach(l -> System.out.println(l));
			Collections.sort(libri, (libro1, libro2) -> libro1.id - libro2.id);
			
		System.out.println(libri);
		
		
		
		
		
		
		
	}//fine main

}//fine libreria
