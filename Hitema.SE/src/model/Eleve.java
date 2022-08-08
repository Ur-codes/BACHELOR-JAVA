package model;

import java.time.LocalDate;
import java.time.Period;

public class Eleve extends Personne  {
	
	private LocalDate dateNaissance;

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	

	
}
