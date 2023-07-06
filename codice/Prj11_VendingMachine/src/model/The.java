package model;

public class The extends Bevanda{
	
	public The(double prezzo) {
		super(prezzo);
		this.nome = "the";
	}

	@Override
	public Bevanda prepara() {
		System.out.println("metti la soluzione di the bergamotto");
		System.out.println("aggiungi acqua bollente");
		return this;
	}

	

}
