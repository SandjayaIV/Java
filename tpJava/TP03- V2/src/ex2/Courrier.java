package ex2;

public abstract class Courrier {
    private int unite_de_volume;
    private double prix;

    public Courrier(int unite_de_volume) {
        this.unite_de_volume = unite_de_volume;
    }

    public int getUnite_de_volume() {
        return unite_de_volume;
    }

    public double getPrix() {
        double prix = 0.5*this.unite_de_volume;
        return prix;
    }

}
