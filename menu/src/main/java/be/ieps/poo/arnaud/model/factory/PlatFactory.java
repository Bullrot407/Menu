package be.ieps.poo.arnaud.model.factory;

import be.ieps.poo.arnaud.model.plats.Plat;
import be.ieps.poo.arnaud.model.plats.Poisson;
import be.ieps.poo.arnaud.model.plats.Viande;
import be.ieps.poo.arnaud.model.plats.Volaille;


public class PlatFactory {

    public Plat getPlat(String type) {
        if ("poisson".equals(type)) {
            return new Poisson(type);
        } else if ("viande".equals(type)) {
            return new Viande(type);
        } else if ("volaille".equals(type)) {
            return new Volaille(type);

        }
        return null;
    }
}

