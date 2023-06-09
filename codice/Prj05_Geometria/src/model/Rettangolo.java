package model;

public class Rettangolo {

	Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double calcolaPerimetro() {
		return 2*(base.calcolaLunghezza() + altezza.calcolaLunghezza());
	}
	
	public double calcolaArea() {
		return base.calcolaLunghezza() * altezza.calcolaLunghezza();
	}

//	@Override
//	public String toString() {
//		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", calcolaPerimetro()=" + calcolaPerimetro()
//				+ ", calcolaArea()=" + calcolaArea() + "]";
//	}
//	
//	
}
