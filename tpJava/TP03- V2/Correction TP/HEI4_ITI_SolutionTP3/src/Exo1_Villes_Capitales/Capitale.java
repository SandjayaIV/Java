package Exo1_Villes_Capitales;

public class Capitale extends Ville{
	
	private String pays;

	public Capitale(String nom) {
		super(nom);
	}
	
	public Capitale(String nom, int nbHabitants, String pays) {
		super(nom, nbHabitants);
		this.pays= pays;
	}
	
	public String obtenirInformations(){
		return super.obtenirInformations()+",est la  capitale de "+ this.pays;
	}

}
