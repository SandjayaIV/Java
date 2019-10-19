package Exo3_Mots_Termes;

import java.util.ArrayList;

public class Terme extends Mot{
	
	
	private int nbDefinition;
	private ArrayList<String> definition;
	
	public Terme(String m) {
		super(m);
		definition= new ArrayList<String>();
		
	}
	
	public void ajouteDefinition(String def){
		definition.add(def);
		
	}
	
	public void afficher(){
		super.afficher();
		
		for(int i=0; i<nbDefinition;i++){
			System.out.println((i+1)+":"+ definition.get(i));
		}
	}
	
	public String toString(){
		String chaine="";
		for(int i=0; i<nbDefinition;i++){
			chaine+=definition.get(i);
		}
		return this.getChaine()+" : "+ chaine+" ";
	}
	
	
	public void setNbDefinition(int nbDefinition) {
		this.nbDefinition = nbDefinition;
	}

}
