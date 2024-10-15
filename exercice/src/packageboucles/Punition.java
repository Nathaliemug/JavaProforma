package packageboucles;

public class Punition {

	public static void main(String[] args) {
		
		int cpt;
		int cpt2;
		
		for(cpt=1; cpt<=20; cpt++)
		{
			System.out.print(cpt);
			
			for(cpt2=2; cpt2<=10; cpt2++)
			{
				System.out.print("\t" + cpt2  * cpt);
			}
			System.out.println();
		
		}
		
		
		
		
	}

}
