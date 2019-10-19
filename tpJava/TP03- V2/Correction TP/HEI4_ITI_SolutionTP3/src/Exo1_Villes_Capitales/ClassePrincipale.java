package Exo1_Villes_Capitales;

public class ClassePrincipale {

	public static void main(String[] args) {
		
		Ville v = new Ville("Les Pennes-Mirabeau",19022);
		System.out.println( v.obtenirInformations() );

		Capitale c = new Capitale("Paris",2153600,"France");
		System.out.println( c.obtenirInformations() );


	}

}
