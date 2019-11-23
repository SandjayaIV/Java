package ex2;

import java.util.Date;
import java.util.EmptyStackException;

public class ex2 {
    public static void main(String[] args) throws FullStationException, EmptyStationException {
        Station station1 = new Station("Republique", 10);
        Station station2 = new Station("Grand Place", 7);

        VLille vLille = new VLille("1", new Date("01/01/2019"));

        // ajout d'un velo a la station 1
        try{
            station1.returnBike(vLille);

        }
        catch(FullStationException e) {
    }
        // location d'un velo
        try {
            station1.takeBike();
        }
        catch(EmptyStationException e){

        }
        try {
            station2.returnBike(vLille);
        }
        catch(FullStationException e){
        }
    }
}