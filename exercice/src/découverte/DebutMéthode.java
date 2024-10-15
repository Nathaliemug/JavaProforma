package découverte;

import java.util.Scanner;

public class DebutMéthode {

	public static void début() {

		System.out.println("***************************");
		System.out.println("********Bienvenue**********");
		System.out.println("***************************");
		System.out.println("\n***************************");
		System.out.println("**   Isabelle Detrixhe   **");
		System.out.println("***************************");
	}

	public static void fin() {
		System.out.println("\n\n");
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println();
		System.out.println("                   au revoir");
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println();
	}
public static int saisieInt(String msg)
{
	int nb;
	System.out.println(msg);
	nb = new Scanner(System.in).nextInt();
	return nb;
}
	public static void main(String[] args) {
		int nb1, nb2;
		Double montant;

		début();
		nb1 = saisieInt("entre un nombre entier svp");

		nb1 = saisieInt("entre ton nombre de doigts stp");
		
		System.out.println("entre un nombre  svp, pour le séparateur des décimales, c'est la virgule");
		montant = new Scanner(System.in).nextDouble();

		fin();

	}

}
