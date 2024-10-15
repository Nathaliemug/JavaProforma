package découverte;

public class MethodeSuite {

	public static void main(String[] args) {
		int nb1, nb2;
do {
		nb1 = LesSaisiesControllées.saisieInt();
		nb2 = LesSaisiesControllées.saisieInt("entrez un autre nombre :");
		System.out.println("la somme est " + somme(nb1, nb2));
		System.out.println("la somme de 3 et 4 " + somme(3, 4));
		System.out.println("le quotient est " + quotient(nb1, nb2));
		if(somme(nb1, nb2)>0)
		{
			System.out.println("somme négative");
		}else
		{
			System.out.println("somme négative");
		}
		nb2 = somme(nb1, nb2);
		somme(nb1, nb2);
}while(LesSaisiesControllées.encore());
	}
		public static int somme(int a, int b)
		{
			return a+b;
		}
		
		public static int différence(int a, int b)
		{
			return a-b;
		}
		
		public static int produit(int a, int b)
		{
			return a*b;
		}
		
		public static int quotient(int a, int b)
		{
			if(b==0)
			{
				System.out.println("division par 0");
				b=1;
			}
			return a/b;
		}
	
	}


