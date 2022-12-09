package be.ieps.poo.arnaud.decorator;

import be.ieps.poo.arnaud.plats.Plat;

public class Riz extends PlatDecorator {
    private String type = " riz";
    private Double prix = 5.0;

    public Riz(Plat platDecore) {

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
