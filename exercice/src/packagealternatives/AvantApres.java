package packagealternatives;

import java.util.Scanner;

public class AvantApres {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int jour, mois, année;
		
		System.out.println("entrez le jour : ");
		jour = new Scanner(System.in).nextInt();
		System.out.println("entrez le mois : ");
		mois = new Scanner(System.in).nextInt();
		System.out.println("entrez l'année : ");
		année = new Scanner(System.in).nextInt();
		if(!(jour>0 && jour<31))
		{
			System.out.println("il me faut la vrai date du jour svp!");
		
		
		if(mois<0 && mois>12)
		{
			if(jour == 1 && mois ==1)
			{
				if(mois>=4 && mois!=11 && mois!=5 && mois!=7 && mois!=8 && mois!=10)
				{
					jour = 30;
					
				}
				if((mois<=4 && mois!=4 && mois!=6 && mois!=9 && mois!=11)||(mois ==28 || mois ==29))
				{
					jour = 31;
					
				}
				mois = mois-1;
			}else
			{
				System.out.println("ATTENTION!!!!!!!il existe 12 mois dans un an");
			}
			
		}
		if(((année%4==0 && !(année%100==0)) ^ (année%400==0)))
		{
			
				System.out.println("la date de la veille : " +(jour-1) + "/" + mois + "/" +année );
			
			System.out.println("la date du lendemain: " +(jour+1) + "/" + mois + "/" +année );
		}
		
	
}
}
