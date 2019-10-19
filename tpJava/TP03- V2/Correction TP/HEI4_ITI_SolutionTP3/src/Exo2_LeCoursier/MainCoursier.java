
package Exo2_LeCoursier;

public class MainCoursier
{

	public static void main(String[] args)
	{
		boolean urgent;
		
		Courrier[] c = new Courrier[10];
		
		Lettre l= new Lettre(true);
		Lettre l1= new Lettre(false);
		
		System.out.println(l);
		System.out.println(l1);
	
	for (int i=0;i<c.length;i++)
		{
			if (Math.random()<0.5){
				urgent=Math.random()<0.5;
				c[i] = new Lettre(urgent);}
			else{
				c[i] = new Colis (1+((int)(10*Math.random()))/2.0);
			}
		}
		
		double s = 0;
		System.out.println("Le sac contient:");
		for (int i=0;i<c.length;i++)
		{
			
			System.out.println("le prix de " +c[i] +" est de "+ c[i].affranchir());
			
			s += c[i].affranchir();
			
		}
		System.out.println("Prix total du courrier est : "+s);
	}
}
