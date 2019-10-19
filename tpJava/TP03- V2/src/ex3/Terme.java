package ex3;

import java.util.HashMap;

public class Terme extends Mot {
    private HashMap<Mot,String> terme;

    public Terme(){
        this.terme = new HashMap<Mot, String>();
    }

    public void setMot(Mot mot, String definition) {
        this.terme.put(mot,definition);
    }

    @Override
    public String getChaine() {
        return super.getChaine();
    }
}
