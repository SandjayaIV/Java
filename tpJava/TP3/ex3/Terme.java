import java.util.ArrayList;

public class Terme extends Mot{
    private ArrayList<String> collection;

    public Terme(ArrayList<String> collection){
        this.collection = collection;
    }
    public ajouteDefinition(String definition){
        collection.add(definition.toString());
    }
    public toString(){
        for(int i = 0; i < collection.length; i++){
            
        }
    }


}