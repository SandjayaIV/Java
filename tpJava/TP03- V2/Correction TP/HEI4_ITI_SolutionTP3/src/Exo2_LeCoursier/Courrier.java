package Exo2_LeCoursier;

public abstract class Courrier
{
	private double volume;
	
	public Courrier(double v){
		this.volume=v;
		
	}
	
	public double getVolume() { 
		return volume; 
	}
	
	public abstract double affranchir();
}
