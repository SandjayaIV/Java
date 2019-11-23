package Aliment;

public class Concombre extends Aliment implements Econome {
    private boolean eplucher;

    public Concombre(int poid, int calorie, String categorie){
        super(poid, calorie, categorie);
        this.eplucher = false;

    }

    @Override
    public void eplucher() {
        this.eplucher = true;
    }
}


