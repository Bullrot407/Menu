package be.ieps.poo.arnaud.model.decorator.accompagnement;

import be.ieps.poo.arnaud.model.decorator.PlatDecorator;
import be.ieps.poo.arnaud.model.plats.Plat;

public class Frites extends PlatDecorator {

    private Double prix = 5.00;

    public Frites(Plat platDecore) {
        super(platDecore);
    }

    @Override
    public String getPreparation() {
        return platDecore.getPreparation() + " accompagné de frites";
    }

    @Override
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public Double getPrix() {
        return platDecore.getPrix() + this.prix;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }
}

