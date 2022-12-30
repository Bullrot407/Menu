package be.ieps.poo.arnaud.model.plats;

public interface Plat {

    String getPreparation();

    Double getPrix();
    void setPrix(Double prix);

    String getType();
    void setType(String type);
}
