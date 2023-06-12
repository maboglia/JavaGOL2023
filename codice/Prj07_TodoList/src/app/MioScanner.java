package app;

import java.util.Scanner;

public class MioScanner {

	private static Scanner scan = new Scanner(System.in);
	
	public static String leggiStringa(String domanda) {
		System.out.println(domanda);
		return scan.nextLine();
	}
	
}
