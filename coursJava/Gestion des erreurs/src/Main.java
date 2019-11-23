import exception.personnalisées.DonPositifException;
import exception.personnalisées.Telethon;
import exception.personnalisées.Ville;
import gerreur.Propagation;
import gerreur.Quotient;

public class Main {
    public static void main(String[] args) {
    Ville v1 = new Ville("Paris",100000);
    Ville v2 = new Ville("Lille",500000);
    Ville v3 = new Ville("Asnieres",80000);
    Telethon telethon = new Telethon();

        try{
            v1.faireDon(telethon,2000);

            v2.faireDon(telethon,2000);

            v3.faireDon(telethon,-2000);
        }catch(DonPositifException e){}

        System.out.println("\nla cagnote est de "+telethon.getSomme());

    }
}
