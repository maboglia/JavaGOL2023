package model;

public class Caffe extends Bevanda{
	
	public Caffe(double prezzo) {
		super(prezzo);
		this.nome = "caffè";
	}

	@Override
	public Bevanda prepara() {
		System.out.println("macina caffè");
		System.out.println("aggiungi acqua 5cl");
		return this;
		// TODO Auto-generated method stub
		
	}

}
