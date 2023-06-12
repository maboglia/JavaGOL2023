package app;

import model.ListaSpesa;
import model.Todo;

public class TodoList {

	public static void main(String[] args) {

		ListaSpesa lista = new ListaSpesa();
		
		//per 10 volte
		for (int i = 0; i < 10; i++) {
			//chiedo all'utente cosa comprare
			String risposta = MioScanner.leggiStringa("Cosa vuoi comprare");
			//con la risposta dell'utente creo un nuovo todo
			Todo t = new Todo(risposta); 
			//aggiungo il todo all'elenco di todo
			lista.addTodo(t, i);
			
		}
		
		//stampo l'elenco delle cose
		System.out.println(lista.printTodo());
		
		
		
		
		
		
	}

}
