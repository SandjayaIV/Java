package ex2;

import java.util.ArrayList;

public class Station {
    private String nom;
    private int capacite_velo;
    private ArrayList<VLille> vLillesDisponibles;

    public Station(String nom, int capacite_velo){
        this.nom = nom;
        this.capacite_velo = capacite_velo;
        this.vLillesDisponibles = new ArrayList<VLille>();
    }

    public String getNom() {
        return nom;
    }
    public int getCapacite(){
        return capacite_velo;
    }

    public void takeBike() throws EmptyStationException{
        if(this.vLillesDisponibles.isEmpty()) {throw new EmptyStationException(this.getNom());}
        else{
            this.vLillesDisponibles.remove(-1);
        }
    }
    public void returnBike(VLille vlille) throws FullStationException{
        if (this.vLillesDisponibles.size() == capacite_velo){ throw new FullStationException(this.getNom());}
        else{
            this.vLillesDisponibles.add(-1,vlille);
        }

    }



}
