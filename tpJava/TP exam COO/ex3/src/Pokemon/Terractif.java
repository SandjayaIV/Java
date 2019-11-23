package Pokemon;

public class Terractif extends Pokemon implements Energie {
    private double taille;
    private float coeff_vitalite;

    public Terractif(String nom, int poid, int nombre_pattes,double taille, float coeff_vitalite){
        super(nom, poid,nombre_pattes);
        this.coeff_vitalite = coeff_vitalite;
        this.taille = taille;
    }
    @Override
    public double speed(){
        double vitesse = this.getNombre_pattes() *((this.getPoid()+1)/10)*2*PokemonWorld.energyLevel()  ;
        return vitesse;
    }
    @Override
    public double absorption(){
        double absorption = coeff_vitalite*this.taille*100;
        return  absorption;

    }


}
