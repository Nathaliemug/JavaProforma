package découverte;

public class MesJolisVecteurs {

	public static void main(String[] args) {
		int[] t1 = { 1, 5, 8, 9, 6, 3 };
		// déclaration, création et initialisation d'un vecteur int
		double t2[] = { 1, 2, 3, 4, 2, 7, 8 };
		char[] t3 = { 'a', 'b', 'c', 'd', 'w' };
		String[] t4 = { "brouillard", "soleil", "pluie" };
		int[] t5 = new int[10];
		int t6[] = new int[5];
		boolean t7[]= {true, true, false};
		/*
		 * int i;
		 * 
		 * for(i=0; i<t6.length; i++) { System.out.println(t6[i]+ " "); }
		 */
		affiche(t1);
		affiche(t6);
		affiche(t5);
		affiche(t2);
		affiche(t3);
		affiche(t7);
		t1[145] =45;
	}

	public static void affiche(boolean[] tab) {
		int i;
		for(i=0;i<tab.length;i++) {
		System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}
		public static void affiche(char[] tab) {
		int i;
		for(i=0;i<tab.length;i++) {
		System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}
		public static void affiche(String[] tab) {
		int i;
		for(i=0;i<tab.length;i++) {
		System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}
		public static void affiche(double[] tab) {
		int i;
		for(i=0;i<tab.length;i++) {
		System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}
		public static void affiche(int[] tab) {
		int i;
		for(i=0;i<tab.length;i++) {
		System.out.print(tab[i]+ " ");
		}
		System.out.println();
		}

}
