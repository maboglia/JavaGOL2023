package enumerazioni;

public enum Taglia {
	S(40), M(44), L(48), XL(52);
	
	int misura;

	private Taglia(int misura) {
		this.misura = misura;
	}
	
	public int getMisura() {
		return misura;
	}
	
}
