public class Lettre implements Poste{
    private boolean ordinaire;

    public Lettre(boolean ordinaire){
        this.ordinaire = ordinaire;
    }

    prix(){
        if(ordinaire){
            System.out.println("prix = 0.8");
        }
        else{
            System.out.println("prix = 0.5");
        }
    }

}