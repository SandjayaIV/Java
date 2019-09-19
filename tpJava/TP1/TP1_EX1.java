package cours;

import java.util.Scanner;

public class TP1_EX1 {
	
	public static void main(String[] args) {
		
		double prix, tva;
		int temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de viennoiseries souhaitez vous ? : ");
		int nb_vien = sc.nextInt();
		System.out.println("Et quel sera votre mode de consommation ?\n- 1) Emporter froid\n- 2) Emporter chaud\n- 3) Sur place : ");
		int mode_conso = sc.nextInt();
		
		if(mode_conso == 1) {
			tva = 0.05;
		} else if(mode_conso == 2) {
			tva = 0.07;
		} else {
			tva = 0.2;
		}
		
		temp = nb_vien/20;
		nb_vien -= temp*20;
		prix = temp*10;
		temp = nb_vien/3;
		nb_vien -= temp*3;
		prix += temp*2;
		temp = nb_vien/1;
		nb_vien -= temp*1;
		prix += temp*1;
		prix += prix*tva;
		
		System.out.println("Le prix à payer est de : " + prix + " Euros.");
		sc.close();
	}

}
