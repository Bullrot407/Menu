package be.ieps.poo.arnaud.plats;

public class Poisson extends Plat {

    public Poisson(){
        setType("poisson");
        setPrix(15.0);
    }

    public Poisson(String type, Double prix) {
        super(type, prix);
    }
}
