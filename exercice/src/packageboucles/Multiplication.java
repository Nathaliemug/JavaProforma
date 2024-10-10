package packageboucles;

import java.util.Scanner;

public class Multiplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nb, i, multi = 0;
		System.out.println("entrez un nombre : ");
		nb = new Scanner(System.in).nextInt();
		
		for(i=1; i<=10; i++)
		{
			multi = nb*i;
			
			System.out.println( nb + "*" + i + "=" + multi);
		}
		
	}

}
