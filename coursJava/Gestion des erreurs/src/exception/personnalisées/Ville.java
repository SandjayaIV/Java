package exception.personnalisées;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants){
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
    public void faireDon(Telethon t, double somme) throws DonPositifException{
        if(somme<0) throw new DonPositifException("la somme doit être positive "+this.getNom()+" c'est pas bien");
        else{
            t.encaisser(somme);
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
