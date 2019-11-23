package Pokemon;

public class Pokemon {
    private String nom;
    private int poid;
    private int nombre_pattes;

    public Pokemon(String nom, int poid, int nombre_pattes){
        this.nom = nom;
        this.poid = poid;
        this.nombre_pattes = nombre_pattes;
    }

    public String getNom() {
        return nom;
    }

    public int getNombre_pattes() {
        return nombre_pattes;
    }

    public int getPoid() {
        return poid;
    }
}
