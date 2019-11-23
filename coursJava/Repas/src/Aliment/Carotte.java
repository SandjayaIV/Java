package Aliment;

public class Carotte extends Aliment implements Econome {
    private boolean eplucher;

    public Carotte(int poid, int calorie, String categorie){
        super(poid, calorie, categorie);
        this.eplucher = false;
    }

    @Override
    public void eplucher() {
        this.eplucher = true;
    }
}
