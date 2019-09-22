package tp2.ex2;

import tp2.ex2.Interrupteur;

public class Lampe {
    private boolean eclair;

    public Lampe() {
        eclair = false;
    }

    public void allume(){
        eclair = true;
        System.out.println("lampe allumee");
        
        
    }