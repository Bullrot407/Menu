package be.ieps.poo.arnaud.model.plats;

public class Viande implements Plat {

    private Double prix;
    private String type;

    public Viande(String type) {
        this.type = type;
    }

    public Viande() {
        this.type = "inconnu";
    }

    @Override
    public String getPreparation() {
        return "Piece de blanc bleu de 300gr cuite sur pierre";
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
