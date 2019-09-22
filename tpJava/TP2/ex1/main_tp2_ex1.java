public class main_tp2_ex1 {
    public static void main(String[] args) {
        Compteur compteur = new Compteur();
        int nombre = 0;
        System.out.println(nombre);

        for (int i = 0; i < 10; i++) {
            nombre = compteur.incrementer();

        }
        System.out.println(nombre);

        for (int i = 0; i < 20;i++){
            nombre = compteur.decrementer();

        }
        System.out.println(nombre);
    }
}