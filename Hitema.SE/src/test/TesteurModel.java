package test;
import java.time.LocalDate;

import model.*;
import model.Global.Genre;

public class TesteurModel {

	public static void main(String[] args) {
		
		Eleve e1 = new Eleve();
		e1.setDateNaissance(LocalDate.of(2000,9,10));
		e1.setEmail("tbachelery@h3hitema.com");
		e1.setPrenom("Théo");
		e1.setNom("Bachelery");
		e1.setGenre(Genre.H);
		

		System.out.println(e1.toString()+e1.getDateNaissance());

		
		
		
	}

}
