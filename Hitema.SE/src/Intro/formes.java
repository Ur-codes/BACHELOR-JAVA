package Intro;

import java.util.Scanner;

public class formes {

	public static void main(String[] args) {
		
		String ctn = "oui";
		Scanner scanner = new Scanner(System.in);
		while (!ctn.contentEquals("")) {
			System.out.println("Veuillez saisir la valeur de la forme :"); //DEMANDE DE SAISIE POUR LA LONGEUR DES FORMES 
			String rep = scanner.nextLine();
			int multiplier = Integer.valueOf(rep);
			
			String forme1 ="";
			String forme2 =""; //INTIALISATION DES VARIABLES DE FORME
			String forme3 ="";
		
			for (int i1 = 0 ; i1 < multiplier ;i1++){ //FORME 1
				forme1 = forme1 + "*";

			}
			System.out.println(forme1);
			System.out.println();
			
			for (int i1 = 0 ; i1 < multiplier ;i1++){ //FORME 2
				for (int i2 = 0 ; i2 < multiplier ;i2++)
				{
					forme2 = forme2 + "*";
					
				}
				System.out.println(forme2);
				forme2="";
				
			}
		
			System.out.println();
			for (int i3 = 0 ; i3 < multiplier ;i3++){ //FORME 3
				forme3 = forme3 + "*";
				System.out.println(forme3);
			}
			System.out.println("Voulez vous continuer ?");
			rep = scanner.nextLine();
			ctn = rep;
		}
		scanner.close();
		System.out.println("Aurevoir !");
	}

}
