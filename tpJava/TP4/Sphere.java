package Exo2_Figure;

public class Sphere implements Figurable{
    private double rayon;

    public Sphere(double rayon){
        this.rayon = rayon;
    }
    public double calculAire() {
        double aire = 2*Math.PI*rayon;
        return aire;
    }
    public double calculVolume() {
        double volume = Math.PI*Math.pow(2,rayon);
        return volume;
    }
}