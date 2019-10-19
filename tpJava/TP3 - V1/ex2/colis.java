public class Colis implements Poste{

    public Colis(int unite_volume){
        this.volume = volume;
    }

    public prix(){
        int prix = 0.5*unite_volume;
        System.out.println("prix = "+ prix);
    }
}