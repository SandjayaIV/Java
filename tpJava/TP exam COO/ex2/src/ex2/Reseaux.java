package ex2;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Reseaux  {
    private ArrayList<Station> stations;

    public Reseaux(){
        this.stations = new ArrayList<Station>();
    }

    public void addStation(Station station){
        stations.add(-1,station);
    }
    public void printNameStation(){
        for(Station station:stations){
            System.out.printf(station.getNom());
        }
    }
    public int  capacityStation(String nom){
        for(Station station: stations){
            if(station.getNom().equals(nom)){
                return station.getCapacite();
            }
            else{
                return 0;
            }
        }
    }
    public int disponibleStations(String nom){
        for(Station station:stations) {
            if (station.getNom().equals(nom)) {
                return station.getCapacite();

            } else {
                return 0;
            }
        }
    }

    public int VeloDisponibe(){
        int somme = 0;
        for(Station station:stations) {
                somme+= station.getCapacite();

        }
        return somme;
    }



}
