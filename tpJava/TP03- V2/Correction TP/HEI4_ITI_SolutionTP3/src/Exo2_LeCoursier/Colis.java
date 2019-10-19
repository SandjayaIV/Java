package Exo2_LeCoursier;
public class Colis extends Courrier
{
	public Colis(double v)
	{
		super(v);
	}


	public double affranchir()
	{
		return 0.5*(this.getVolume());
	}

	
	public String toString()
	{
		return "je suis un Colis mon volume est de : "+this.getVolume()+")";
	}
}
