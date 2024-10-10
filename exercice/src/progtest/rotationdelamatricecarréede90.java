package progtest;
import java.util.Scanner;

public class rotationdelamatricecarréede90 {

	public static void main(String[] args) {
		int [][]premierTableau = new int [3][3]; 
		int []tabTemp = new int[3*3];
		int [][]deuxiemeTableau = new int[3][3];
		int i=0, j = 0, k=0, l=0;
		
		for(i=0; i<=2; i++)
		{
			for (j=0; j<=2; j++)
			{
				System.out.println("entrez une valeur : ");
				premierTableau [i][j]= new Scanner(System.in).nextInt();
				deuxiemeTableau[l]=premierTableau[i];
				l++;
			}
		
		}
		for (k=0; k<=8; k++)
		{
		System.out.print(deuxiemeTableau[k]);
		}

	}

}
