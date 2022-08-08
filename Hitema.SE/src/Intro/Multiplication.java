package Intro;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		String ctn = "oui";
		Scanner scanner = new Scanner(System.in);
		while (!ctn.contentEquals("")) {
	
		System.out.println("Veuillez saisir la valeur à multiplier :");
		String rep = scanner.nextLine();
		
		int multiplier = Integer.valueOf(rep); 

		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(multiplier+"x"+i+"="+(multiplier*i));
		
		}
		
		
		System.out.println("Voulez vous continuer ?");
		rep = scanner.nextLine();
		ctn = rep;
		
		
		}
			
		
	
	scanner.close();
	System.out.println("Aurevoir");
	}
}