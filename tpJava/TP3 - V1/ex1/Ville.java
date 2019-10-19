public class Ville{
    private String nom;
    private int nbr_habitant;

    public Ville(String nom, int nbr_habitant){
        this.nom = nom.toLowerCase();
        this.nbr_habitant = nbr_habitant;
    }

    public void obtenirInformation(){
        if(this.nbr_habitant < 100000){
            System.out.println(nbr_habitant+""+nom+", "+"petite ville");

        }
        if(this.nbr_habitant > 100000 && this.nbr_habitant < 500000){
            System.out.println(nbr_habitant+""+nom+", "+"ville moyenne");

        }
        if(this.nbr_habitant > 100000){
            System.out.println(nbr_habitant+""+nom+", "+"grande ville");

        }
    }

}