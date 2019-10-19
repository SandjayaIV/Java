package ex2;

public class Lettre extends Courrier {
    private int unite_de_volume;
    private double prix;
    private boolean urgent;

    public Lettre(boolean urgent){
        super(1);
        this.urgent = urgent;
    }

    @Override
    public double getPrix() {
        if(urgent){
            double prix = 0.8;
            return prix;
        }
        else{
            double prix = super.getPrix();
            return prix;

        }
    }
}
