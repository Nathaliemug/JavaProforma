package découverte;

public class VendrediPM {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int nb, age;
		double banque;
		String prénom;
		
		prénom = LesSaisiesControllées.SaisieString("entrez votre prénom :");
		nb = LesSaisiesControllées.saisieInt();
		age = LesSaisiesControllées.SaisieIntSup0("entrez votre age :");
		banque = LesSaisiesControllées.saisieDouble("entrez le montant de votre compte bancaire : ");
		
		System.out.println(prénom + " vous avez " + age);
		System.out.println("nb=  " +nb );
		System.out.println("compte bancaire  " + banque);

	}

}
