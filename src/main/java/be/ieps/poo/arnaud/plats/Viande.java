package be.ieps.poo.arnaud.plats;

public class Viande extends Plat {
    public Viande() {
        setType("viande");
        setPrix(10.0);
    }

    public Viande(String type, Double prix) {
        super(type, prix);
    }
}
