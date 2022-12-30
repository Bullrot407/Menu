
package be.ieps.poo.arnaud.controller.commande;


import be.ieps.poo.arnaud.model.plats.Plat;

public class Table {
    private Integer numeroMenu;

    public Table(Integer numeroMenu) {

        this.numeroMenu = numeroMenu;
    }
    public Integer getNumeroMenu() {
        return numeroMenu;
    }

    public void setNumeroMenu(Integer numeroMenu) {
        this.numeroMenu = numeroMenu;
    }
}

