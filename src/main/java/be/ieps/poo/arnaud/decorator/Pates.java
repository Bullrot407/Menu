package be.ieps.poo.arnaud.decorator;

import be.ieps.poo.arnaud.plats.Plat;

public class Pates extends PlatDecorator {
    private String type = " pates";
    private Double prix = 5.0;

    public Pates(Plat platDecore) {

        this.platDecore = platDecore;
    }

    public String getPreparation() {
        return platDecore.getType() + this.type;
    }

    public String getType() {
        return type;
    }

    public Double getPrix() {
        return platDecore.getPrix() + this.prix;
    }
}

