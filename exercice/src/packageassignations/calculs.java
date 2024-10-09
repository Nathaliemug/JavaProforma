package packageassignations;

import java.util.Scanner;

public class calculs {

	public static void main(String[] args) {
		int nb1, nb2;
		System.out.println("entrez le premier nombre : ");
		nb1 = new Scanner(System.in).nextInt();
		
		System.out.println("entrez le deuxième nombre : ");
		nb2 = new Scanner(System.in).nextInt();
		
		System.out.println("somme : " + nb1 + "+" + nb2 + "=" + (nb1+nb2));
		System.out.println("différence  : " + nb1 + "-" + nb2 + "=" + (nb1-nb2));
		System.out.println("produit  : " + nb1 + "*" + nb2 + "=" + (nb1*nb2));
   
	}

}
