package packageboucles;

import java.util.Scanner;

public class Intervalle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int nb1, nb2, temp;
		int somme = 0;

		System.out.println("entrer le 1er nombre  : ");
		nb1 = new Scanner(System.in).nextInt();

		while (!(nb1 % 1 == 0)) {
			System.out.println("entrer le 1er nombre  : ");
			nb1 = new Scanner(System.in).nextInt();

		}

		System.out.println("entrer le 2eme nombre : ");
		nb2 = new Scanner(System.in).nextInt();

		while (!(nb2 % 1 == 0)) {
			System.out.println("entrer le 1er nombre  : ");
			nb1 = new Scanner(System.in).nextInt();

		}

		if (nb1 > nb2) {
			temp = nb1;
			nb1 = nb2;
			nb2 = temp;
		}
		
     temp = nb1;
		while (nb1 <= nb2) {

			somme = somme+nb1;
			nb1++;

		}

		System.out.println("la somme des nombres entiers compris dans l’intervalle de  "+ temp + " à " + nb2 + " est :" + somme);

	}

}
