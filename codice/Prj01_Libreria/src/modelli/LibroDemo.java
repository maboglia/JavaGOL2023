package modelli;

public class LibroDemo {

	public static void main(String[] args) {

		Libro libro1 = new Libro();//costruttore dell'oggetto
		libro1.titolo =  "Io, robot";
		libro1.prezzo = 10.5;
		
		Libro libro2 = new Libro();
		libro2.titolo = "I malavoglia";
		libro2.prezzo = 9.4;
		
		Disco d1 = new Disco();
		d1.titolo = "dogocrazia";
		d1.prezzo = 1000;
		
		System.out.println(libro1.stampa());
		System.out.println(libro2.stampa());
		System.out.println(d1.stampa());
		
		double totale = libro1.prezzo + libro2.prezzo + d1.prezzo;
		
		System.out.println(totale);
		
	}

}
