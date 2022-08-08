package Intro;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TestNote {

	public static void main(String[] args) {
		String format = "0.0000";
		DecimalFormat formatter = new DecimalFormat(format);
		String ctn = "oui";
		double moyenne = 0;
		ArrayList<Classe> LNote = new ArrayList<Classe>();
		Scanner scanner = new Scanner(System.in);
		while (!ctn.contentEquals("")) {
			
			System.out.println("Veuillez saisir la note n°1 :");
			String rep = scanner.nextLine();
			Classe Int1 = new Classe(Double.valueOf(rep));
			LNote.add(Int1);
			
			System.out.println("Veuillez saisir la note n°2 :");
			rep = scanner.nextLine();
			Classe Int2 = new Classe(Double.valueOf(rep));
			LNote.add(Int2);
			
			System.out.println("Veuillez saisir la note n°3 :");
			rep = scanner.nextLine();
			Classe Int3 = new Classe(Double.valueOf(rep));
			LNote.add(Int3);
			
			System.out.println("Veuillez saisir la note n°4 :");
			rep = scanner.nextLine();
			Classe Int4 = new Classe(Double.valueOf(rep));
			LNote.add(Int4);
			
			System.out.println("Veuillez saisir la note n°5 :");
			rep = scanner.nextLine();
			Classe Int5 = new Classe(Double.valueOf(rep));
			LNote.add(Int5);
			
			
			System.out.println("Le nombre de note est de :"+LNote.size());
			
			for(int i = 0 ; i<LNote.size();i++) {
				moyenne += LNote.get(i).getNote();
			}
			String d = formatter.format(moyenne/LNote.size());
			System.out.println("La moyenne est de :"+d);
			LNote.clear();
			moyenne = 0;

			System.out.println("Voulez vous continuer ?");
			rep = scanner.nextLine();
			ctn = rep;
			
		}
		scanner.close();
	}

}
