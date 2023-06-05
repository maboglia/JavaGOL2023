package controller;

import model.Libro;

public class LibroCtrl {

	//proprietà
	public Libro[] scaffale = new Libro[100];
	
	//metodi - CRUD
	//create
	public void addLibro(int pos, Libro libro) {
		scaffale[pos] = libro;
	}
	//read
	public Libro getLibroByPosizione(int pos) {
		return scaffale[pos];
	}
	
	public Libro[] getAll() {
		return scaffale;
	}
	
	//update
	public void updateLibro(int pos, Libro libro) {
		scaffale[pos] = libro;
	}
	
	//delete
	public void deleteLibro(int pos) {
		scaffale[pos] = null;
	}
}
