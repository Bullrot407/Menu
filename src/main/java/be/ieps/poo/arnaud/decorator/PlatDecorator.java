package be.ieps.poo.arnaud.decorator;

import be.ieps.poo.arnaud.plats.Plat;


public abstract class PlatDecorator extends Plat {

    protected Plat platDecore;

    public abstract String getType();
    public abstract Double getPrix();

}
