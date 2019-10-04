
package Exo2_LeCoursier;

public class Lettre extends Courrier
{
	private boolean urgent;

	public Lettre(boolean u)
	{
		super(1);
		urgent = u;
	
	}

	public Lettre()
	{
		this(false);
	}

	public double affranchir()
	{
		if (urgent)
			return 0.8;
		else
			return 0.5;
	}

	  public String toString()
			{
				if (urgent) { 
					return "Lettre urgente";}
				else
					{return "Lettre ordinaire";}
				
			}
}
