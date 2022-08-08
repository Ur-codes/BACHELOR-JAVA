package model;

import java.util.ArrayList;

public class Professeur extends Personne {

	private ArrayList<String> matieres;

	public ArrayList<String> getMatieres() {
		return matieres;
	}

	public void setMatieres(ArrayList<String> matieres) {
		this.matieres = matieres;
	}
	
}