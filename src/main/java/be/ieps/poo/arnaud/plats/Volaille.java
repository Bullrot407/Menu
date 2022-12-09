package be.ieps.poo.arnaud.plats;

public class Volaille extends Plat{
    public Volaille(){
        setType("volaille");
        setPrix(7.0);
    }

    public Volaille(String type, Double prix) {
        super(type, prix);
    }
}
