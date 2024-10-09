package découverte;

public class TypeDeDonnées {

	public static void main(String[] args) {
		// 8 types de données primaires
		//dont
		// 4 types entiers ( toujours signés )
		byte nb1; // -128 à 127
		short nb2; //-32768 à 32767
		int nb3; //+- 2 milliards
		long nb4; //9*10 expo 19
		//2 types de nombres  à virgule flottante
		float nb5; // 6 à 7 chiffres significatifs
		double nb6; // 15 chiffres significatifs, habituellement on utilise les doubles 
		nb6 = 5.69; // séparateur des décimales est le .
		// 1 type caractère
		char lettre; 
		// 1 et 1 seule caractère
		// encadreé de quotes donc les ''
		lettre = 'm';
		//lettre = '°';
		//1 type booléen
		boolean ok;
		ok = true;
		ok = false;
		
		// il existe également une infinité de types de données "classes"
		
		String prénom;
		prénom = "il ne pleut toujours pas";
		System.out.println(prénom.toUpperCase());
		prénom.length();
		
	
		

	}

}
