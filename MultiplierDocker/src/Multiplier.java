import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez choisir un chiffre");
		if(scanner.hasNext() != false) {
		String rep = scanner.next();
		
		int multiplier = Integer.valueOf(rep);
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(multiplier+"x"+i+"="+(i*multiplier));
		}
		scanner.close();
		}
		else {
			System.out.println("Il faut saisir quelque chose");
		}
	}

}
