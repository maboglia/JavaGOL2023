package model;

public class Dado {

	public int facce = 6;
	
	public int lancia() {
		
		double casuale = Math.random();//0.0   0.999999999
		
		int i = (int)(facce * casuale) + 1;
		
		return i;
		
	}
	
	
}
