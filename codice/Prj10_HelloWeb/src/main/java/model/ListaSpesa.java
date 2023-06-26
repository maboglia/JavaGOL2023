package model;

public class ListaSpesa {

	private Todo[] elenco = new Todo[10];
	
	public Todo[] getElenco() {
		return elenco;
	}
	
	public void addTodo(Todo t) {
		int pos = trovaPostoLibero();
		if (pos > -1)
			elenco[pos] = t;
	
	}
	
	private int trovaPostoLibero() {
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i]==null)
				return i;
		}

		return -1;
	}

	public void addTodo(Todo t, int pos) {
		elenco[pos] = t;
	}
	
	public boolean disponibile(int pos) {
		if (elenco[pos] == null)
			return true;
		
		return false;
	}
	
	public String printTodo() {
		String s = "";
		for (Todo todo : elenco) {
			s += todo + "\n";
		}
		return s;
	}
}
