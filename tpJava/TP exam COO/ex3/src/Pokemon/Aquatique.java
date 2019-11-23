package Pokemon;

public class Aquatique extends Pokemon implements Energie{

    public Aquatique(String nom, int poid, int nombre_nageoires){
        super(nom, poid, nombre_nageoires);
    }
    public int getnombreNageoires(){
        return this.getNombre_pattes();
    }

}
