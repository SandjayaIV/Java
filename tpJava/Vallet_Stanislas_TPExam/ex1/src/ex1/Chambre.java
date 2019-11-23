package ex1;

public class Chambre extends Hotel {
    private int numero;
    boolean reservation;
    int nbr_lit;

    public Chambre(int numero, boolean reservation, int nbr_lit){
        this.numero = numero;
        this.reservation = reservation;
        this.nbr_lit = nbr_lit;
    }

    public int getNbr_lit() {
        return nbr_lit;
    }

    public int getNumero() {
        return numero;
    }
    public boolean getReservation(){
        return reservation;
    }



}
