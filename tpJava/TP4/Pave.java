package Exo2_Figure;
public class Pave implements Figurable {
    private double arrete_x;
    private double arrete_y;
    private double arrete_z;

    Pave(double arrete_x,double arrete_y,double arrete_z){
        this.arrete_x = arrete_x;
        this.arrete_y = arrete_y;
        this.arrete_z = arrete_z;
    }

    public double calculAire() {
        double aire_x_y = arrete_x * arrete_y;
        double aire_y_z = arrete_y * arrete_z;
        double aire_z_x = arrete_z * arrete_x;
    
        double aire = 2*aire_x_y + 2*aire_y_z + 2*aire_z_x;
        return aire;
        }

    public double calculVolume() {
        double volume = arrete_x * arrete_y * arrete_z;
        return volume;
    }

}