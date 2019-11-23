package ex1;

public class Hotel  implements  Reservation{
    private String nom;
    int nbr_chambre;
    int prix_chambre;
    int nbr_occupant_par_chambre[];

    public Hotel(String nom, int nbr_chambre, int prix_chambre){
        this.nom = nom;
        this.nbr_chambre = nbr_chambre;
        this.prix_chambre = prix_chambre;
        this.nbr_occupant_par_chambre = new int[nbr_chambre];

    }
    public Hotel(int nbr_chambre, int prix_chambre){
        this.nbr_chambre = nbr_chambre;
        this.prix_chambre = prix_chambre;
    }

    public int getNbr_chambre() {
        return nbr_chambre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix_chambre(int prix_chambre) throws PrixPositif {
        if (prix_chambre < 0) throw new PrixPositif("erreur grave, le prix est inferieur à zero") {
        };
        else {
            this.prix_chambre = prix_chambre;
        }
    }


    public void Reservation(int numero_chambre, int nbr_occupant){
        int nombre_chambre_reserve;
        for(int i=0; i<this.nbr_occupant_par_chambre.length();i++){
            if(this.nbr_occupant_par_chambre[i] == null){                //nbr occupant toujours superieur à zero
                nombre_chambre_reserve++;
            }
        }
        if(nombre_chambre_reserve < nbr_chambre){
            this.nbr_occupant_par_chambre[numero_chambre] = nbr_occupant;
        }
    }
    public int chiffredAffaire(){
        int ca = this.nbr_occupant_par_chambre.length * this.prix_chambre;
        return ca;
    }



}
