
public class main_tp2_ex1 {
    public static void main(String[] args) {
        Compteur compteur = new Compteur();
        System.out.println(compteur.getVal());

        for (int i = 0; i < 10; i++) {
           compteur.incrementer();

        }
        System.out.println(compteur.getVal());

        for (int i = 0; i < 20; i++) {
           compteur.decrementer();

        }
        System.out.println(compteur.getVal());

        // compteur borne
        CompteurBorne compteurb = new CompteurBorne(20);

        for (int i = 0; i < 40; i++) {
           compteurb.incrementer();
            System.out.println(compteurb.getVal());

        }

    }
}