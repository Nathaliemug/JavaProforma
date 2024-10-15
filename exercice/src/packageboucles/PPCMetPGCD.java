package packageboucles;

import découverte.LesSaisiesControllées;

public class PPCMetPGCD {

	public static void main(String[] args) {
		
       int nb1;
       int nb2;
       int reste;
       int ppcm;
       
       nb1 = LesSaisiesControllées.saisieInt();
       nb2 = LesSaisiesControllées.saisieInt();
       
       
    	   reste = nb1 % nb2;
    	   if(nb1 % nb2 !=0)
    	   {
    		   ppcm = (nb1*nb2);
    	   }
      
       
       
	}

}
