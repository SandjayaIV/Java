package Exo3_Mots_Termes;

public class Mot {
	
	private String chaine;
	
	public Mot(String chaine){
		this.chaine= chaine.toLowerCase();
	}

	public String getChaine() {
		return chaine;
	}
	
	public int comparer(Mot mot){
		if(this.chaine.length() < mot.getChaine().length()){
			return -1;
		}else if(this.chaine.length() > mot.getChaine().length()){
			return 1;
		}else{
			return 0;
		}
	}
	
	public void afficher(){
		for(int c=-chaine.length(); c<this.chaine.length(); c++){
			System.out.print("*");
			}
		System.out.print("\n");
		System.out.println("* "+this.chaine+" *");
		
		for(int i=-chaine.length(); i<this.chaine.length(); i++){
			System.out.print("*");
		}
		System.out.print("\n");
	}

}
