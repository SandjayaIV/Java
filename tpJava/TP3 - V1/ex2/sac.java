public class Sac{
    private ArrayList<Poste> courrier;

    public Sac(ArrayList<Poste> courrier){
        this.courrier = courrier;

    }
    public affranchissement(){
        for(int i = 0; i < courrier.length();i++){
            System.out.println(courrier[i]);
        }
        
    }

    public prix_sac(){
        for(int i = 0; i < courrier.length(); i++){
            System.out.println(courrier[i].prix());
        }
        
    }


}