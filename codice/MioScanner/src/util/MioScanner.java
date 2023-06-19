package util;

import java.util.Scanner;

public class MioScanner {

	private static Scanner scan = new Scanner(System.in);
	
	public static String leggiStringa(String domanda) {
		System.out.println(domanda);
		String risposta = scan.nextLine();
		scan.nextLine();
		return risposta;
	}
	
	public static double leggiDouble(String domanda) {
		System.out.println(domanda);
		double d = scan.nextDouble();
		scan.nextLine();
		return d;
	}
	
	public static int leggiInt(String domanda) {
		System.out.println(domanda);
		int i = scan.nextInt();
		scan.nextLine();
		return i;
	}
	
}
