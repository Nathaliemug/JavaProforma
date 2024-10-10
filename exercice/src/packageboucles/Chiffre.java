package packageboucles;

import java.util.Scanner;

public class Chiffre {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nb,i;
		System.out.println( "Entrez un chiffre : ");
		nb= new Scanner(System.in).nextInt();
		
			
			while(!(nb<=3)) 
			{
				System.out.println( "Entrer un chiffre jusqu'à ce que le chiffre corresponde à 0,1,2 ou 3");
				nb= new Scanner(System.in).nextInt();
			}
			
			System.out.println( "Au revoir");
				
			
		
		}
		
		
	

}
