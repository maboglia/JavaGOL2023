package model;

public class Cioccolata extends Bevanda{
	
	public Cioccolata(double prezzo) {
		super(prezzo);
		this.nome = "the";
	}

	@Override
	public Bevanda prepara() {
		System.out.println("aggiungi polvere di cacao brasiliano");
		System.out.println("aggiungi acqua calda 10cl");
		return this;
		// TODO Auto-generated method stub
		
	}

}
