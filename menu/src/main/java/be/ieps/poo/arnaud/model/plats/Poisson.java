package be.ieps.poo.arnaud.model.plats;

public class Poisson implements Plat {

    private Double prix;
    private String type;

    public Poisson(String type) {
        this.type = type;
    }

    public Poisson() {
        this.type = "inconnu";
    }

    @Override
    public String getPreparation() {
        return "sole";
    }

    @Override
    public Double getPrix() {
        return prix;
    }

    @Override
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
