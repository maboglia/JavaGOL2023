package model;

public class Todo {

	private String cosa;
	private boolean completo;
	
	public Todo(String cosa) {
		this.cosa = cosa;
		this.completo = false;
	}

	public String getCosa() {
		return cosa;
	}

	public void setCosa(String cosa) {
		this.cosa = cosa;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	@Override
	public String toString() {
		
		String s = "";
		
		if (completo) {
			s += "[*]";
		} else {
			s += "[ ]";
		}
			s += " " + cosa;
		
		return s;
	}
	
	
	
}
