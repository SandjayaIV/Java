package Exo2_Figure;
import java.util.ArrayList;
import java.util.Scanner;

public class main_figure {
    public static void main(String[] args) {
        boolean volonte = true;
        int selection = 0;
        // creation d'un array list pour toutes les figures
        ArrayList<Figurable> figure = new ArrayList<Figurable>();

        while (volonte) {
            System.out.println(" 1°) Pavé \n 2°) Cercle");
            Scanner sc = new Scanner(System.in);
            selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Selectionne la longueur des arretes");
                double arrete_x = sc.nextDouble();
                double arrete_y = sc.nextDouble();
                double arrete_z = sc.nextDouble();
                Pave pave = new Pave(arrete_x, arrete_y, arrete_z);
                figure.add(pave);
            } else if (selection == 2) {
                System.out.println("Selectionne le rayon de la sphere");
                double rayon = sc.nextDouble();
                Sphere sphere = new Sphere(rayon);
                figure.add(sphere);
            } else {
                System.out.println("Vous n'avez pas choisi 1 ou 2");
            }

            System.out.println("Souhaitez vous creer une nouvelle figure ?");
            volonte = sc.nextBoolean();
            sc.close();
        }

    }
}