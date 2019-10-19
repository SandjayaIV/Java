package ex3;

public class Mot {
    private String chaine;

    public Mot(chaine){
        this.chaine = chaine;

    }

    public String getChaine() {
        return chaine;
    }

    public int comparaisonChaine(String chaine_compare){
        if(chaine.length()>chaine_compare.length()){
            return 1;
        }
        if(chaine.length()<chaine_compare.length()){
            return -1;
        }
        if(chaine.length()==chaine_compare.length()){
            return 0;
        }
    }
}
