package be.ieps.poo.arnaud.model.decorator.dessert;

import be.ieps.poo.arnaud.model.decorator.PlatDecorator;
import be.ieps.poo.arnaud.model.plats.Plat;

public class Glace extends PlatDecorator {

    private Double prix = 5.00;

    public Glace(Plat platDecore) {
        super(platDecore);
    }

    @Override
    public String getPreparation() {
        return platDecore.getPreparation() + " accompagné d'une coupe de glace";
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

