package model;

public abstract class Personne {
	
	private String nom;
	private String prenom;
	private String email;
	private Global.Genre genre;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Global.Genre getGenre() {
		return genre;
	}
	public void setGenre(Global.Genre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
	
	
}
