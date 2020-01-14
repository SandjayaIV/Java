public class Test {
    public static void main(String[] args) {
        int a = 2;
        Parent p = new Parent(3);
        p.moi();
        System.out.println("ajoute("+a+") ="+p.ajoute(a));
        Enfant1 e1 = new Enfant1(3,4);
        e1.moi();
        System.out.println("ajoute ("+a+") ="+e1.ajoute(a));
        e1 = new Enfant2(3,4,5);
        e1.moi();
        System.out.printf("ajoute( "+a+") = "+e1.ajoute(a));

    }
}
