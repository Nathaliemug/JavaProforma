package packagealternatives;

import java.util.Scanner;

public class PlusGrand {

	public static void main(String[] args) {
		int nb1, nb2;
		System.out.println("entrez le premier nombre :");
		nb1 = new Scanner(System.in).nextInt();
		System.out.println("entrez le deuxième nombre :");
		nb2 =new Scanner(System.in).nextInt();
		
		if(nb1<nb2)
		{
			System.out.println(nb1 + " est plus petit que " + nb2);
		}
		else if(nb1==nb2)
		{
			System.out.println("ils sont égaux");
		}
		else
		{
			System.out.println(nb1 + " est plus grand que " + nb2);
		}
		

	}

}
