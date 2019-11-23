package ex2;

import java.util.Date;

public class VLille {
    private String identifiant;
    private java.util.Date date_circulation;

    public VLille(String identifiiant, java.util.Date date_circulation) {
        this.identifiant = identifiiant;
        this.date_circulation = date_circulation;
    }

    public Date getDate_circulation() {
        return date_circulation;
    }

    public String getIdentifiant() {
        return identifiant;
    }
    public void toString(String identifiant,Date date){
        System.out.println("\nIdentifiant"+identifiant+"\ndate de circulation"+String.format("%d %m %y",date));
    }
    public boolean equals(VLille vLille1){
        if (this.identifiant.equals(vLille1.identifiant)){
            return true;
        }
        else{
            return false;
        }
    }
}
