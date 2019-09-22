
public class Cercle {
    private int rayon;
    private int coordonnee_x;
    private int coordonnee_y;

    public Cercle(int rayon, int coordonnee_x, int coordonnee_y) {
        this.rayon = rayon;
        this.coordonnee_x = coordonnee_x;
        this.coordonnee_y = coordonnee_y;
    }

    /*
     * public Cercle copie() { return Cercle(); }
     */
    public double perimetre() {
        double perimetre_value = 2 * rayon * Math.PI;
        return perimetre_value;
    }

    public double aire() {
        double aire_value = rayon * rayon * Math.PI;
        return aire_value;
    }

    public boolean chevauchement(Cercle cercle2) {
        boolean chevauchement;
        double distance_centre = Math
                .sqrt((this.coordonnee_x * cercle2.coordonnee_x) + (this.coordonnee_y * cercle2.coordonnee_y));
        double rayon_cercle = this.rayon + cercle2.rayon;
        if (distance_centre < rayon_cercle) {
            chevauchement = true;

        } else {
            chevauchement = false;
        }
        return chevauchement;
    }
}