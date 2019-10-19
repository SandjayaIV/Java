package ex2;

public class mainex2 {
    public static void main(String[] args) {
        Lettre lettre = new Lettre(true);
        double prix = lettre.getPrix();
        System.out.println("prix ="+prix);
        Colis colis = new Colis(5);
        int v = colis.getUnite_de_volume();
        System.out.println("volume colis = "+v);
        Sac sac = new Sac();
        sac.add(lettre);
        sac.add(colis);
        sac.getPrix();
        sac.clearSac();
        sac.isEmptySac();






    }
}
