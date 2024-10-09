package découverte;

import java.util.Scanner;

public class LesSaisies {

	public static void main(String[] args) {
		String nom, prénom;
		int âge;
		double montant;
		boolean enForme;
		char lettrePréférée;
		
		//afficher la phrase entre ""
		System.out.println("Bonjour, entrez votre prénom svp");
		//saisir le prénom
		prénom = new Scanner(System.in).nextLine();
		
		System.out.print("enchanté, "+ prénom + " entre ton nom : ");
		nom = new Scanner(System.in).nextLine();
		
		System.out.println("Entrez ton âge : ");
		âge = new Scanner(System.in).nextInt();
		
		System.out.println("Es-tu en forme?");
		enForme = new Scanner(System.in).nextBoolean();
		
		System.out.println("entre ton caractère préféré");
		lettrePréférée = new Scanner(System.in).nextLine().charAt(0);
		//lettrePréférée = new Scanner(System.in).nextLine().trim().toUpperCase().charAt(0);
		//........................renvoie une string..................................
		//.........................................renvoie une string.................
		//....................................................renvoie une string...........
		//.......................................................................renvoie le caractère d'indice 0(premier)
		
		System.out.println("entre ton caractère préféré");
		montant = new Scanner(System.in).nextDouble();
		//attention la saisie dépend du panneau de configuration
		//l'utilisateur doit encoder une VIRGULE pour le séparateur des décimales.
		
		montant = 4.5;
		
	

	}

}
