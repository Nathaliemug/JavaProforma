package packagealternatives;

import java.util.Scanner;

public class AvantApres {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int jourSaisie, moisSaisie, annéeSaisie, mois, jour, année;
		
		System.out.println("entrez le jour : ");
		jourSaisie = new Scanner(System.in).nextInt();
		System.out.println("entrez le mois : ");
		moisSaisie = new Scanner(System.in).nextInt();
		System.out.println("entrez l'année : ");
		annéeSaisie = new Scanner(System.in).nextInt();
		
		
		if (!(jourSaisie>1)&&(jourSaisie<31))
		{
			
			
			if((jourSaisie==1 && moisSaisie==1))
			{
				mois=12;
				jour = 31;
				année = annéeSaisie-1;
				System.out.println("la date de la veille : " + jour + "-" + mois + "-" + année);
				System.out.println("la date du lendemain : "+ (jourSaisie+1) + "-" + moisSaisie + "-" + annéeSaisie);
			}
			
			else if(jourSaisie==1){
				mois = moisSaisie-1;
				jour = 31;
				System.out.println("la date de la veille : " + jour + "-" + mois + "-" + annéeSaisie);
				System.out.println("la date du lendemain : "+ (jourSaisie+1) + "-" + moisSaisie + "-" + (annéeSaisie) );
			}
			
			
			else if(jourSaisie==30 || jourSaisie==31) {
				jour=1;
				mois=moisSaisie+1;
				
				System.out.println("la date du de la veille : "+ (jour) + "-" + (mois) + "-" + (annéeSaisie) );
				System.out.println("la date du lendemain : "+ (jour) + "-" + (mois) + "-" + (annéeSaisie) );
			}
			
			else if(jourSaisie==31 && moisSaisie==12) {
				jour=1;
				année=annéeSaisie+1;
				mois=1;
				
				
				System.out.println("la date de la veille : "+ (jourSaisie-1) + "-" + (moisSaisie) + "-" + (annéeSaisie) );
				System.out.println("la date du lendemain : "+ (jour) + "-" + (mois) + "-" + (année) );
			}

			else if((annéeSaisie%4==0 && !(annéeSaisie%100==0)) ^ (annéeSaisie%400==0)&&(jourSaisie==1 && moisSaisie==3)) {
			
				jour=29;
				mois = moisSaisie-1;
				System.out.println("la date de la veille : " + jour+ "-" + mois + "-" + annéeSaisie);
				System.out.println("la date du lendemain : "+ (jourSaisie+1) + "-" + (moisSaisie) + "-" + (annéeSaisie) );
			}else {
				jour=29;
				mois = moisSaisie-1;
				System.out.println("la date de la veille : " + jour+ "-" + mois + "-" + annéeSaisie);
				System.out.println("la date du lendemain : "+ (jourSaisie+1) + "-" + (moisSaisie) + "-" + (annéeSaisie) );
			}
			
			
		}else {
			
			
			System.out.println("la date de la veille : " + (jourSaisie-1) + "-" + moisSaisie + "-" + annéeSaisie);
			System.out.println("la date du lendemain : "+ (jourSaisie+1) + "-" + moisSaisie + "-" + annéeSaisie);
		}
		
		}
		
		}

