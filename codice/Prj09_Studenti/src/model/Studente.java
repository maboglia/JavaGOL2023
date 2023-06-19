package model;

public class Studente {

	private static int matricolatore = 1; 
	
	private int matricola;
	private String nome;
	private String cognome;
	
	public Studente(String nome, String cognome) {
		this.matricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;

		System.out.println("Studente costruito");
	}

	public int getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	
	
}
