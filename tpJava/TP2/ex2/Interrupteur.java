package tp2.ex2;
public class Interrupteur{

private boolean appuye;
private Lampe lampe;

public Interrupteur(boolean appuye){
    this.appuye = appuye;
}
public void ferme(){
    appuye = true
    if(appuye){
    Lampe.allume();
    }

}

}
