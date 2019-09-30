public class Mot {
    private Sting chaine;

public Mot(chaine){
    this.chaine = chaine.toLowCase();
}

public print(){
    System.out.println(this.chaine);
}

public compare(String chaine1){
    if(this.chaine.length()>chaine1.length){
        return 1;
    }
    if(this.chaine.length()<chaine1.length){
        return -1;
    }
    if(this.chaine.length() == chaine1.length()){
        return 0;
    }
    
}

}
