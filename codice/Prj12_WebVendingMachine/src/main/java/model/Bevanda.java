package model;

public abstract class Bevanda {

		//props
		protected String nome;
		protected double prezzo;
		
		//costruttore
		public Bevanda(double prezzo) {
			super();
			this.prezzo = prezzo;
			System.out.println("metti il bicchiere");
			System.out.println("metti zucchero");
			System.out.println("metti paletta");
		}
		
		public abstract Bevanda prepara();

		@Override
		public String toString() {
			return "Bevanda [nome=" + nome + ", prezzo=" + prezzo + "]";
		}
		
		
}
