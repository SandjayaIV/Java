package gerreur;

public class Quotient {
    public int fact(int n){
        if(n<=0) throw new ArithmeticException();
        int result = 1;
        for(int i= 1;i<=n;i++){
            result *=i;
        }
        return result;
    }
}
