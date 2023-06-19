package model;

import java.util.ArrayList;

public class Registro {

	private ArrayList<Studente> elenco;
	private String nomeCorso;
	
	public Registro(String nomeCorso) {
		this.elenco = new ArrayList<>();
		this.nomeCorso = nomeCorso;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public ArrayList<Studente> getElenco() {
		return elenco;
	}
	
	
}
