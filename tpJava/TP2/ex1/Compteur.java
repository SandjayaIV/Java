public class Compteur {
    private int i;

    Compteur() {
        i = 0;
    }

    public void incrementer() {
        i++;
    }

    public void decrementer() {
        while (i > 0) {
            i--;
        }

    }
    public int getVal(){
        return i;
    }

}