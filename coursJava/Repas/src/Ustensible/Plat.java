package Ustensible;

import Aliment.Aliment;

import java.util.ArrayList;

public abstract class Plat {
    private ArrayList<Aliment> contenu;
    private int tps_de_cuisson;

    public Plat() {
        this.contenu = new ArrayList<Aliment>();
    }

    public void getContenu() {
        for (Aliment aliment : contenu) {
            System.out.println(aliment);
        }
    }

    public void addContenu(Aliment aliment) {
        contenu.add(aliment);

    }

    public void setTps_de_cuisson(int tps_de_cuisson) throws TpsCuisson {
        for (Aliment aliment : contenu) {
            if (aliment.setTps_cuit() > tps_de_cuisson) throw new TpsCuisson("le plat sera pas assez cuit") {
            };
            else if (aliment.setTps_cuit() < tps_de_cuisson) throw new TpsCuisson("le plat sera trop cuit !! ");
        }
    }

}