package be.ieps.poo.arnaud.factory;

import be.ieps.poo.arnaud.plats.Plat;
import be.ieps.poo.arnaud.plats.Poisson;
import be.ieps.poo.arnaud.plats.Viande;
import be.ieps.poo.arnaud.plats.Volaille;

public class PlatFactory {

    public Plat getPlat(String type) {
        if ("poisson".equals(type)) {
            return new Poisson();
        } else if ("viande".equals(type)) {
            return new Viande();
        } else if ("volaille".equals(type)) {
            return new Volaille();

        }
        return null;
    }
}
