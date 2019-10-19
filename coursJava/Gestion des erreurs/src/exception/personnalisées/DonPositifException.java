package exception.personnalisées;

public class DonPositifException extends Exception {
    public DonPositifException(String message){
        System.out.print(message);
    }
}
