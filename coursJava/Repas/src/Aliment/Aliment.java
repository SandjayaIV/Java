package Aliment;

public abstract class Aliment {
    private int poid;
    private int calorie;
    private boolean cuit;
    private String categorie;
    private int tps_cuit;
    public Aliment(int poid, int calorie, String categorie){
        this.poid = poid;
        this.calorie = calorie;
        this.cuit = false;
        this.categorie = categorie;
    }

    public boolean getCuit(boolean cuit) {
        return this.cuit;
    }

    public void setTps_cuit(int tps_cuit) {
        this.tps_cuit = tps_cuit;
    }

    public String getCategorie(){
        return categorie;
    }
}
