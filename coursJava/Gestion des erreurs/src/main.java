package gerreur;
import static java.lang.System.*;

public class main {
    public static void main(String[] args) {
        int val= 10;
        int val1 = 0;
        double result = 0;

        try{
            result = val/val1;
            out.println("le resultat de la division est "+result);

            }
            catch (ArithmeticException exception){
            out.println("Attention la division par zéro n'est pas autorisée");
            }
        out.println("tout s'est bien déroulé");

    }
}
