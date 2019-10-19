package exception.personnalisées;

public class Telethon {
    private double somme;
    public Telethon(){
        this.somme = 0;
    }
    public void encaisser(double somme){
        this.somme+=somme;
    }

    public double getSomme() {
        return somme;
    }
}
