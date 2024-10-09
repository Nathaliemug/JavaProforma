package découverte;

public class LesOperateurs {

	public static void main(String[] args) {
		int nb1 = 10, nb2 = 78, nb3 = 56, nb4 = 3;
		String maChaîne = "il fait moche";
		
		//les opérateurs mathématiques
		nb1 = nb2 + nb3; // +somme
		nb1 = nb2-nb3; // - difference
		nb1 = nb2*nb3; // * produit
		nb1 = nb2/nb3; // / quotient
		System.out.println(nb2 + "/" + nb2 + " = " + nb1);
		
		//////////ATTENTION: - division entière(il enlève le décimal)//////////////
		nb1 = 5/2; //entier / entier donne un quotient entier
		
		System.out.println(nb1+ " " + nb2+ " " +nb3);
		System.out.println("la moyenne :" + (nb1+nb2+nb3)/3); // division entière
		System.out.println("la moyenne :" + (nb1+nb2+nb3)/3.0); //division entier par double donne double
		
		System.out.println("la moyenne :" + (nb1+nb2+nb3)/(double)nb4);
		//transtypage : le temps du calcul je  transforme nb4 en un double
		// to cast(en anglais)
		System.out.println("la moyenne :" + (nb1+nb2+(double)nb3)/nb4);
		System.out.println("la moyenne :" + (double)((nb1+nb2+nb3)/nb4));
		
		nb1 = nb2%nb3; // modulo = reste de la division entière
		nb1= 10%3; // le reste la division de 10 par 3 c'est 1
		
		nb1 = (int) Math.pow(2, 3); //2 exposant 3 = 8
		System.out.println(" 2 exposant 3 = " + Math.pow(2, 3));
		System.out.println("racine carrée de 5 ="+ Math.pow(5, 0.5)); // 5 exposant 1/2
		System.out.println("racine carrée de 5 KO ="+ Math.pow(5, 1/2)); // 5 exposant 0
		System.out.println("racine carrée de 5 = "+ Math.sqrt(5));

		System.out.println(Math.PI);

		// opérateurs d'affectation
		nb1=8;
		nb1=nb1+8;
		nb1+=8;  //nb1=nb1+8;
		nb1-=8;  //nb1=nb1-8;
		nb1*=8;  //nb1=nb1*8;
		nb1/=8;  //nb1=nb1/8;
		
		//opérateur d'incrémentation et de décrémentation
		nb1 = nb1 + 1;
		nb1+=1;
		nb1++;
		
		nb1 = nb1-1;
		nb1-=1;
		nb1--;
		
		//opérateurs de comparaison
		System.out.println("nb1=nb2? " + (nb1==nb2)); //ATTENTION ==
		System.out.println("nb1<>nb2? " + (nb1!=nb2)); //ATTENTION !=
		System.out.println("nb1<nb2? " + (nb1<nb2));
		System.out.println("nb1<=nb2? " + (nb1<=nb2));
		System.out.println("nb1>nb2? " + (nb1>nb2));
		System.out.println("nb1>=nb2? " + (nb1>=nb2));
		
		//ATTENTION pour les string
		System.out.println("maChaîne=\"soleil\" ? " + !maChaîne.equals("soleil"));
		maChaîne = "soleil";
		System.out.println("maChaîne=\"soleil\" ? " + maChaîne.equals("soleil"));
		System.out.println("maChaîne=\"soleil\" ? " + maChaîne.equalsIgnoreCase("soleil"));
		
		//les opérateurs booléen
		System.out.println("nb1<nb2 et nb1<nb3 ?" + (nb1<nb2 && nb1<nb3)); //ET : évaluation courte
		System.out.println("nb1<nb2 et nb1<nb3 ?" + (nb1<nb2 & nb1<nb3)); // ET : évaluation longue
		
		System.out.println("nb1<nb2 ou nb1<nb3 ?" + (nb1<nb2 || nb1<nb3)); //OU : évaluation courte
		System.out.println("nb1<nb2 ou nb1<nb3 ?" + (nb1<nb2 | nb1<nb3)); // OU : évaluation longue
		
		System.out.println("not(nb1=nb2 ou nb1=nb3) ?" + !(nb1==nb2 || nb1==nb3)); // not
		
		System.out.println("(nb1=nb2 XOR nb1=nb3) ?" + !(nb1==nb2 ^ nb1==nb3)); // XOR : ou exclusif
		                                                                       // soit l'un ou l'autre mais pas les 2
		                                                                      // les 2 opérands son contraires pour renvoyer true
		

	}

}
