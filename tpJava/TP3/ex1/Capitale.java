public class Capitale extends Ville{
    private String pays;

    public Capitale(String nom, int nbr_habitant, String pays){
        this.nom = nom;
        this.nbr_habitant = nbr_habitant;
        this.pays = pays;
    }
    @Override
    public void obtenirInformation(){
        System.out.println(pays);

    }


}