package packageassignations;

import java.util.Scanner;

public class Permutation3Variables {

	public static void main(String[] args) {
		int a, b, c, temp;
		System.out.println("Entrez la valeur de a : ");
		a = new Scanner(System.in).nextInt();
		System.out.println("Entrez la valeur de b : ");
		b = new Scanner(System.in).nextInt();
		System.out.println("Entrez la valeur de c : ");
		c = new Scanner(System.in).nextInt();
		
		temp = a;
		
		System.out.println("a reçoit la valeur de b : " + (a = b));
		System.out.println("b reçoit la valeur de c" +(b = c));
		System.out.println("c reçoit la valeur de a " +(c = temp));
		

	}

}
