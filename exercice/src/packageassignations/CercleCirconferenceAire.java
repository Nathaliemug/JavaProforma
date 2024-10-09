package packageassignations;

import java.util.Scanner;

public class CercleCirconferenceAire {

	public static void main(String[] args) {
		double rayon, Circonférence, aire ;
		
		System.out.println("entrez la valeur du rayon : ");
		
		rayon = new Scanner(System.in).nextInt();
		
		System.out.println(" Circonférence :" + (Circonférence = (2* Math.PI *rayon)));
		System.out.println(" Circonférence :" + (aire =(Math.PI *rayon)));
		

	}

}
