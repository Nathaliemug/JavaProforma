package packageboucles;

import découverte.LesSaisiesControllées;

public class MinMax {

	public static void main(String[] args) {
		int nb;
		int cpt = 0;
		int min = 0, max = 0;

		nb = LesSaisiesControllées.saisieInt();
		max = nb;
		min = nb;
		
		do
		{
			nb = LesSaisiesControllées.saisieInt();
			if (max > nb) {
				max = nb;

			}
			if (min < nb) {
				min = nb;

			}

			cpt++;

		}while (!(nb == 0)) ;

		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);

		

	}

}
