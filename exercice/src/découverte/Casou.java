package découverte;

import java.util.Scanner;

public class Casou {

	public static void main(String[] args) {
		int nb;
		System.out.println("entrez un nombre svp :");
		nb = new Scanner(System.in).nextInt();
		switch(nb) {
		case 5 : 
			System.out.println("petit nombre");
			break;
		case 8 : 
			System.out.println("nombre moyen");
		}

	}

}
