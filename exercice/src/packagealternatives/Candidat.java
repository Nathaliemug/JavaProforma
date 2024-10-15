package packagealternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
		String prénom;
        short âge;
        
        System.out.println("entrez votre prénom");
        prénom=(new Scanner(System.in)).nextLine(); // saisir une chaine
        System.out.println("entrez votre âge");
        âge=(new Scanner(System.in)).nextShort();
        
        // Si le prénom est Isabelle , pas sélectionnée 
        if( prénom.equalsIgnoreCase("Isabelle")){ // !!!!!!!!!!!!! STRING
            System.out.println("pas sélectionnée");
        }    
        else{ 
            //    Pour les âges inférieurs à 20 et supérieurs à 50,  vous n'êtes pas concerné 
            if(âge<20 || âge>50){
                System.out.println("vous n'êtes pas concerné");
            }
            else{
                //Si l'âge est compris entre 20 et 30 mais ni 25 ni 26,  formation A 
                if(âge>=20 && âge<=30 && âge!=25 && âge !=26){
                    System.out.println("formation A");
                }
                else{
                    //Si l'âge est compris entre 31 et 50 mais pas entre 40 et 47, Formation B 
                    if(âge>=31 &&âge<=50 && !(âge>=40 && âge<=47)){
                    //  if(âge>=31 && âge<=50 && (âge<40 || âge>47)) {        
                        System.out.println("formation B");
                    }
                    else{ // les autres
                        System.out.println("formation C");
                    }
                            
                }
            }
        }
    }
	

}
