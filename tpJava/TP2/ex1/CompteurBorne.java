public class CompteurBorne extends Compteur{
    private int borne;

    public CompteurBorne(int borne){

        this.borne = borne;
    }


    public void incrementer() {
       if(this.getVal() < this.borne){
          super.incrementer();
       }
       else{
           System.out.println("Borne maximale atteinte");
       }

    }

}