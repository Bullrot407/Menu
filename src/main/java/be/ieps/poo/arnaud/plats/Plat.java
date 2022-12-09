package be.ieps.poo.arnaud.plats;

public abstract class Plat {
    private String type;
    private Double prix;


    public Plat(String type, Double prix) {
        this.type = type;
        this.prix = prix;
    }

    protected Plat() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getPreparation() {return type;}

    @Override
    public String toString() {
        return "Plat{" +
                "type='" + getType() + '\'' +
                ", prix=" + getPrix() +
                '}';
    }
}
