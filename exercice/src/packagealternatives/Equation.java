package packagealternatives;

import java.util.Scanner;

public class Equation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a, b, x;
		System.out.println("entrez  a :");
		a = new Scanner(System.in).nextInt();
		System.out.println("entrez  b :");
		b = new Scanner(System.in).nextInt();
		
		if(a==0 && b!=0) 
		{
			System.out.println("la division par 0 est impossible");
		}
		else if(a==0 && b==0)
		{
			System.out.println("division impossible!!!!!!!!!!!");
		}
		else
		{
			System.out.println("la valeur de x = -b/a est : " +(x=-b/a));
		}

	}

}
