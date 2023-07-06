package interfacce;

public class Libro implements Comparable<Libro>{
	
	//props
	int id;
	String titolo;
	double prezzo;
	
	//costruttore
	public Libro(int id, String titolo, double prezzo) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		
		return this.titolo.compareTo(altro.titolo);
	}
	
	

}//fine libro
