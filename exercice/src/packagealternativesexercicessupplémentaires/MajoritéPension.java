package packagealternativesexercicessupplémentaires;

import java.util.Scanner;

public class MajoritéPension {

	public static void main(String[] args) {
		int âge, pension;
		System.out.println("Entrez votre âge :");
		âge = new Scanner(System.in).nextInt();
		
		
		if(âge < 18)
		{
			System.out.println("Encore " + (18-âge) + " années avant d’être majeur ");
		}else 
		{
			System.out.println("Vous êtes majeur depuis " + (âge-18) + " années");
		}
		
		System.out.println("Entrez votre âge :");
		pension = new Scanner(System.in).nextInt();
		
		if(âge < 65)
		{
			System.out.println("Encore " + (65-âge) + " années avant d’être pensionné ");
		}else 
		{
			System.out.println("Vous êtes pensionné depuis " + (âge-65) + " années");
		}

	}

}
