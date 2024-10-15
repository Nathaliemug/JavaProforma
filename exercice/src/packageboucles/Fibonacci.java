package packageboucles;

public class Fibonacci {

	public static void main(String[] args) {
		int nb1=0;
		int nb2=1;
		int cpt;
		int nb3;
		
		System.out.println(nb1);
		
		System.out.println(nb2);
		
		for(cpt = 0; cpt <=17; cpt++)
		{
			nb3 = nb1 + nb2;
			
			System.out.println(nb3);
			
			nb1 = nb2;
			nb2 = nb3;
			
			
		}

	}

}
