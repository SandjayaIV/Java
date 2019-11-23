package Pokemon;

public class PokemonWorld {
    private static double energy;

    public PokemonWorld(double energy){
        this.energy = energy;
    }



    public static double energyLevel(){
        return  energy;
    }
}
