package model;

public class Prodotto {

	private String codice;
	private String nome;
	private double prezzo;
	
	/**
	 * Crea un nuovo prodotto
	 * @param codice Passa il codice prodotto
	 * @param nome Inserisci nome prodotto
	 * @param prezzo Prezzo del prodotto
	 */
	public Prodotto(String codice, String nome, double prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
	 
	
	
	
}
