package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import controller.AulaCtrl;
import model.Studente;
import util.MioScanner;

public class AulaDemo {

	public static void main(String[] args) {

		String nomeCorso = MioScanner.leggiStringa("Nome del corso");
		
		AulaCtrl ctrl = new AulaCtrl(nomeCorso);
		
		try {
			Scanner scan = new Scanner(new File("files/studenti.txt"));
			
			while(scan.hasNextLine()) {
				
				String riga = scan.nextLine();//tutta la riga
				String[] nomecognome =  riga.split(",");//splitta la riga usando il separatore ,
				String nome = nomecognome[0];
				String cognome = nomecognome[1];
				ctrl.addStudente(new Studente(nome, cognome));
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		for (Studente s : ctrl.getStudenti()) {
			System.out.println(s);
		}
		
	}

}
