import java.util.ArrayList;

public class main_interface {
    public static void main(String[] args) {
        ArrayList<Criant> liste =  new ArrayList<Criant>();
        Chien chien1 = new Chien();
        liste.add(chien1);               
        Chien chien2 = new Chien();
        liste.add(chien2);
        Chien chien3 = new Chien();
        liste.add(chien3);

        Chat chat1 = new Chat();
        liste.add(chat1);
        Chat chat2 = new Chat();
        liste.add(chat2);
        Chat chat3 = new Chat();
        liste.add(chat3);

        for(int i = 0; i < liste.size();i++){
            liste.get(i).crier();
        }



    }

}
