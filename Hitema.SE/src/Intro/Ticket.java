package Intro;

public class Ticket {

	private String label;
	private static int compteur;
	
	public Ticket() {
		compteur++;
		label = "Ticket No"+compteur;
	}
	
	@Override
	public String toString() {
		return "Ticket [label=" + label + "]";
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public int getCompteur() {
		return compteur;
	}

	
	
	
}
