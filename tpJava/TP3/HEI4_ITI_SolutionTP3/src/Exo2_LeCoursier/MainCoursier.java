
package Exo2_LeCoursier;

import java.util.ArrayList;

public class MainCoursier
{

	public static void main(String[] args)
	{
		boolean urgent;
		ArrayList<Courrier> contenu = new ArrayList<Courrier>();
		Sac sac = new Sac(10,contenu);

		
		Lettre l= new Lettre(true);
		Lettre l1= new Lettre(false);
		
		System.out.println(l);
		System.out.println(l1);
		sac.ajouter(l1);
		sac.ajouter(l);
		
		double s = 0;
		System.out.println("Le sac contient:");
		for (int i=0;i<sac.getVolume();i++)
		{
			
			System.out.println("le prix de " +sac.getElementContenu(i)+ "est de "+ sac.getElementContenu(i).affranchir());
			
			s += sac.getElementContenu(i).affranchir();
			
		}
		System.out.println("Prix total du courrier est : "+s);
	}
}
