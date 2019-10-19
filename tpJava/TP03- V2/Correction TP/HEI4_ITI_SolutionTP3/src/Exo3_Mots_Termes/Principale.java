package Exo3_Mots_Termes;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("quel est votre terme?");		
		String chaine= sc.nextLine();
		
		Terme monTerme = new Terme (chaine);
				
		System.out.println("combien de definitions sont associées à ce terme");
		int nb=sc1.nextInt();
		
		monTerme.setNbDefinition(nb);
		System.out.println("veuillez les saisir:");
		
		for (int i = 0; i <nb; i++) {
			String def= sc.nextLine();
			monTerme.ajouteDefinition(def);
				}
		monTerme.afficher();

		System.out.println(monTerme);
	}



}
