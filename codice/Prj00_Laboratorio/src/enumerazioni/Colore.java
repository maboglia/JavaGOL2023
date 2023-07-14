package enumerazioni;

public enum Colore {
	RED("#FF0000", "255, 0, 0"), 
	GREEN("#00FF00", "0, 255, 0"), 
	BLUE("#0000FF", "0, 0, 255");
	
	String esa;
	String rgb;
	private Colore(String esa, String rgb) {
		this.esa = esa;
		this.rgb = rgb;
	}
	
	
}
