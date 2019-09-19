package cours;

import java.util.Scanner;

public class TP1_EX2 {
	
	public static double convertir (double taux, double montant, boolean inverse) {
		double resultat;
		if(!inverse) {
			resultat = montant*taux;
		} else {
			resultat = montant*(1/taux);
		}

		return resultat;
	}

	public static void main(String[] args) {
		boolean continuer = true;
		double resultat;
		double taux = 1.11;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Quel conversion souhaitez vous effectuer ? \n- 1) EUR -> USD\n- 2) USD -> EUR : ");
			int mode_conv = sc.nextInt();
			System.out.println("Quel est le montant à convertir ? : ");
			double montant = sc.nextDouble();
			
			if(mode_conv == 1) {
				boolean inverse = false;
				resultat = convertir(taux, montant, inverse);
				System.out.println(montant + " EUR = " + resultat + " USD\n");
			} else {
				boolean inverse = true;
				resultat = convertir(taux, montant, inverse);
				System.out.println(montant + " USD = " + resultat + " EUR\n");
			}
			
			
			
			System.out.println("Souhaitez vous effectuer une nouvelle conversion ? \n- 1) Oui\n- 2) Non : ");
			int nouv_conv = sc.nextInt();
			if (nouv_conv == 2) {
				continuer = false;
			}
			
		} while (continuer);
		
		sc.close();

	}

}
