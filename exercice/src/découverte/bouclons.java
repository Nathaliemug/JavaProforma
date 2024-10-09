package découverte;

import java.util.Scanner;

public class bouclons {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nb, multipleDe3, cpt;
		System.out.println("Entrez un nombre plus grand que zéro svp : ");
		nb = new Scanner(System.in).nextInt();
		
		while(nb<=0)
		{
			System.out.println("plus grand que 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Entrez un nombre plus grand que zéro, j'ai dit: ");
			nb = new Scanner(System.in).nextInt();
		}
		
		
		do {
			System.out.println("Entrez un multiple de 3 : ");
			multipleDe3 = new Scanner(System.in).nextInt();
		}while(multipleDe3 % 3 !=0);
		
		for(cpt =100; cpt>=0 ; cpt=cpt-1 /*ou cpt--*/)
		{
			System.out.println(cpt);
		} //cpt suivant donc cpt=cpt-1
		System.out.println("j'arriiiiiiiiiiiiiiiiiiiive!!!!!!!!!!!!!!!!" + cpt);
;
	}

}
