package model;

import java.util.ArrayList;
import java.util.Scanner;



public class Dessinateur {
	
		public ArrayList<model.Forme.forme> ListeForme = new ArrayList<>();
		
	
	public Dessinateur() {
	}




	
	public ArrayList<model.Forme.forme> getListeForme() {
		return this.ListeForme;
	}
	
	public void addForme(model.Forme.forme e) {
		this.ListeForme.add(e);
	}



	public void setListeForme(ArrayList<model.Forme.forme> listeForme) {
		this.ListeForme = listeForme;
	}
	
	
	
	public void CreateForm(ArrayList<model.Forme.forme> listeForme) {
	Scanner scanner = new Scanner(System.in);
	
		
			System.out.println("Veuillez saisir la longeur de la forme :"); //DEMANDE DE SAISIE POUR LA LONGEUR DES FORMES 
			String rep = scanner.nextLine();
			int multiplier = Integer.valueOf(rep);
			for(int j = 0 ; j < listeForme.size();j++) {
			scanner.close();
			String forme1 ="";
			String forme2 =""; //INTIALISATION DES VARIABLES DE FORME
			String forme3 ="";
			
			if(listeForme.get(j).equals(model.Forme.forme.Ligne)){
			for (int i1 = 0 ; i1 < multiplier ;i1++){ //FORME 1
				forme1 = forme1 + "*";
	
			}
			System.out.println(forme1);
			System.out.println();
			}
			
			if(listeForme.get(j).equals(model.Forme.forme.Rectangle)){
			for (int i1 = 0 ; i1 < multiplier ;i1++){ //FORME 2
				for (int i2 = 0 ; i2 < multiplier ;i2++)
				{
					forme2 = forme2 + "*";
					
				}
				System.out.println(forme2);
				forme2="";
			}	
			}
		
			System.out.println();
			
			if(listeForme.get(j).equals(model.Forme.forme.Triangle)){
			for (int i3 = 0 ; i3 < multiplier ;i3++){ //FORME 3
				forme3 = forme3 + "*";
				System.out.println(forme3);

			}
			System.out.println();
			}

		
	}
	
	System.out.println("Aurevoir !");
	}

}

