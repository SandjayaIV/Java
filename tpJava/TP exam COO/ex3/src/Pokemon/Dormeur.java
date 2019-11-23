package Pokemon;

public class Dormeur extends Pokemon implements Energie{
    private  double taille;
    private int heures_repos;

    public Dormeur(String nom, int poid, int nombre_pattes, double taille, int heures_repos){
        super(nom, poid, nombre_pattes);
        this.taille = taille;
        this.heures_repos = heures_repos;
    }

    @Override
    public double speed() {
        double vitesse = this.getNombre_pattes()*((this.getPoid()+1)/10)*2*PokemonWorld.energyLevel();
        return vitesse;
    }

    @Override
    public double absorption() {
        double absorption =  taille*2-(this.heures_repos*2);
    }
}
