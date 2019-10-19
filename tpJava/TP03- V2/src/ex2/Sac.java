package ex2;

import java.util.ArrayList;

public class Sac {
    private ArrayList<Courrier> contenu;

    public Sac(){
        this.contenu = new ArrayList<Courrier>();
    }
    public void add(Courrier courrier){
        contenu.add(courrier);
    }
    public void clearSac(){
        contenu.clear();
    }
    public void isEmptySac(){
        if(contenu.isEmpty()){
         System.out.println("le sac est vide");
        }
    }
    public void getPrix(){
        if(contenu.isEmpty() != true){
            for(Courrier courrier: contenu){

                System.out.println("le prix du courrier est"+courrier.getPrix()+"\n");
            }
        }
        else{
            isEmptySac();
        }

    }
}
