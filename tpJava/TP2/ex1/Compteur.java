public class Compteur{
    private int i;
    Compteur(){
        i = 0;
    }
    public int incrementer(){
        i++;
        return i;
    }
    public int decrementer(){
        while(i>0){
            i--;
        }        
        return i;
    }

}