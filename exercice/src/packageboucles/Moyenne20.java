package packageboucles;

import java.util.Scanner;

public class Moyenne20 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nb1;
		int cpt;
		int cpt2=0;
		int moyenne = 0;
		
		
		for(cpt=0; cpt<20; cpt++)
		{
			System.out.println("entrer nombre : ");
			nb1 = new Scanner(System.in).nextInt();
			
			if(nb1 > 10 && nb1 < 20)
			{
				moyenne =moyenne + nb1;
				cpt2++;
				
			}
	
		}
		try {
			  
			
				System.out.println("la moyenne des 20 nombres entrer compris entre 10 et 20 est : " +(double) moyenne/cpt2);

			
		}
		catch(java.lang.ArithmeticException e)
		{
			System.out.println("La division par 0 est impossible!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
		}
	}

}
