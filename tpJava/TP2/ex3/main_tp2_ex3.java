public class main_tp2_ex3{
    public static void main(String[] args) {
        
        Cercle cercle1 = new Cercle(4,2,3);
        Cercle cercle2 = new Cercle(10, -3,8);
        double perimetre1 = cercle1.perimetre();
        double aire1 = cercle1.aire();
        System.out.println(perimetre1);
        System.out.println(aire1);
        boolean chevauchement = cercle1.chevauchement(cercle2);
        System.out.println(chevauchement);

    }
}