package packageassignations;

import java.util.Scanner;

public class Moyenne3Nombres {

	public static void main(String[] args) {
		int nb1, nb2,nb3;
		System.out.println("entrez le prémier nombre : ");
		nb1 = new Scanner(System.in).nextInt();
		System.out.println("entrez le deuxième nombre : ");
		nb2 = new Scanner(System.in).nextInt();
		System.out.println("entrez le troisième nombre : ");
		nb3 = new Scanner(System.in).nextInt();
		
		System.out.println("La moyenne est : " + (double)((nb1+nb2+nb3)/3));

	}

}
