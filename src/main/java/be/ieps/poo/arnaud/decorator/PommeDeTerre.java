package be.ieps.poo.arnaud.decorator;

import be.ieps.poo.arnaud.plats.Plat;


public class PommeDeTerre extends PlatDecorator {

    private String type = " pomme de terre";
    private Double prix = 5.0;

    public PommeDeTerre(Plat platDecore) {

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
