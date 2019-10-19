package Exo1_Villes_Capitales;

public class Ville {
	
	private String nom;
	private int nbHab;
	private String categorie;
	
	Ville(String nom){
		this.nom=nom.toLowerCase();
	}
	
	Ville(String nom, int nbHab){
		this.nom= nom.toLowerCase();
		this.nbHab= nbHab;
		
	}
	
	protected String categorie(){
		if(this.nbHab < 100000 ){
			this.categorie= "petite ville";
		}
		else if(nbHab >= 100000 && nbHab <= 500000 ){
			this.categorie= "ville moyenne";
		}
		else if(nbHab > 500000 ){
			this.categorie= "grande ville";
		}
		return this.categorie;
	}
	

	
	public String obtenirInformations(){
		return nom+": "+nbHab+" habitants, "+categorie();
	}


}
