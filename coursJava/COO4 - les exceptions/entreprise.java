public class Entreprise{
    private int capital;
    private String mission;

    public Entreprise(int capital, String mission){
        this.capital = capital;
        this.mission = mission;

    }  
    public getMission() {
        System.out.println(mission);
    }
    public getCapital(){
        System.out.println(capital);
    }
}