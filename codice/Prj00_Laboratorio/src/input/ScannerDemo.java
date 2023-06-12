package input;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("cosa vuoi comprare");
		
		String risposta =  sc.nextLine();
		
		System.out.println("Vuoi comprare  "  + risposta);

	}

}
