package packagealternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
	String prénom;
	byte âge;
	
	System.out.println("entrez votre prénom : ");
	prénom = new Scanner(System.in).nextLine();
	
	System.out.println("entrez votre âge");
	âge = new Scanner(System.in).nextByte();
	
	
	if (prénom.equals("Isabelle"))
	{
		System.out.println("pas sélectionnée");
	}
	
	if (âge<20 || âge>50) 
	{
		System.out.println(" vous n’êtes pas concerné ");
	}
	
	if (âge>=20 && âge<=30 && âge!=25 && âge!=26) 
	{
		System.out.println(" formation A  ");
	}
	if ((âge>=31 && âge<=50) && !(âge>=40 && âge<47)) 
	{
		System.out.println("Formation B");
	}
	else
	{
		System.out.println("Formation C");
	}
	

	}
	

}
