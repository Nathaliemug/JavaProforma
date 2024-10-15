package découverte;

import java.util.Scanner;

public class LesSaisiesControllées {

	public static int saisieInt() {
		int nb=0;
		boolean ok;
		do {
			ok=true;
			try {
				System.out.println("entrez un nombre svp");
				nb= new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un entier que je voulais");
				ok=false;
			}
		}while(! ok); // ok==false   ok !=true

		return nb;

	}
	public static int saisieInt(String texte) {
		int nb=0;
		boolean ok;
		do {
			ok=true;
			try {
				System.out.println(texte);
				nb= new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un entier que je voulais");
				ok=false;
			}
		}while(! ok); // ok==false   ok !=true

		return nb;

	}
	public static double saisieDouble() {
		double nb=0;
		boolean ok;
		do {
			ok=true;
			try {
				System.out.println("entrez un nombre svp");
				nb= new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un nb que je voulais");
				ok=false;
			}
		}while(! ok); // ok==false   ok !=true

		return nb;

	}
	public static double saisieDouble(String texte) {
		double nb=0;
		boolean ok;
		do {
			ok=true;
			try {
				System.out.println(texte);
				nb= new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un nb que je voulais");
				ok=false;
			}
		}while(! ok); // ok==false   ok !=true

		return nb;

	}
	public static int SaisieIntSup0() {

		boolean ok;
		int nbsup0=0;
		do {
			ok=true;
			try { // on essaie
				System.out.println("entrez un nombre supérieur à 0 svp");
				nbsup0= new Scanner(System.in).nextInt();
			}
			// si on soulève l'exception InputMismatchException
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un entier positif que je voulais");
				ok=false;
			}
			if(ok && nbsup0<=0) {
				System.out.println("un nombre plus grand que zéro svp");
				ok=false; 
			}
		}while(! ok); // ok==false   ok !=true
		return nbsup0;	
	}
	public static int SaisieIntSup0(String texte) {

		boolean ok;
		int nbsup0=0;
		do {
			ok=true;
			try { // on essaie
				System.out.println(texte);
				nbsup0= new Scanner(System.in).nextInt();
			}
			// si on soulève l'exception InputMismatchException
			catch(java.util.InputMismatchException e) {
				System.out.println("et mip'ti fi, c'est un entier positif que je voulais");
				ok=false;
			}
			if(ok && nbsup0<=0) {
				System.out.println("un nombre plus grand que zéro svp");
				ok=false; 
			}
		}while(! ok); // ok==false   ok !=true
		return nbsup0;	
	}
	public static String SaisieString() {
		String p;
		System.out.println("entrez votre chaine de caractères");
		p=new Scanner(System.in).nextLine();
		return p;
	}
	public static String SaisieString(String texte) {
		String p;
		System.out.println(texte);
		p=new Scanner(System.in).nextLine();
		return p;
	}

	public static char SaisieChar() {
		char p;
		String s;
		do {
			System.out.println("entrez votre chaine de caractères");
			s=new Scanner(System.in).nextLine();
			if(s.length()==0)
				System.out.println("au moins un caractère");
		}while(s.length()==0);
		p=s.charAt(0);
		return p;
	}
	public static char SaisieChar(String texte) {
		char p;
		String s;
		do {
			System.out.println(texte);
			s=new Scanner(System.in).nextLine();
			if(s.length()==0)
				System.out.println("au moins un caractère");
		}while(s.length()==0);
		p=s.charAt(0);
		return p;
	}
	public static boolean encore() {
		String rep;
		do {
			System.out.println("voulez-vous recommencer ? (oui/non)");
			rep= new Scanner(System.in).nextLine();
		}while(! rep.equalsIgnoreCase("oui") && ! rep.equalsIgnoreCase("non"));
		/*if(rep.equalsIgnoreCase("oui"))
			return true;
		else
			return false;
		*/
		return rep.equalsIgnoreCase("oui");
	}
		

	

}
