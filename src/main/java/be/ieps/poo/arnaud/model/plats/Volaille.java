package be.ieps.poo.arnaud.model.plats;

public class Volaille implements Plat {

    private Double prix;
    private String type;

    public Volaille(String type) {
        this.type = type;
    }

    public Volaille() {
        this.type = "inconnu";
    }

    @Override
    public String getPreparation() {
        return "Poulet roti";
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
