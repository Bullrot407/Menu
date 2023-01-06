package be.ieps.poo.arnaud;

import be.ieps.poo.arnaud.controller.MenuController;
import be.ieps.poo.arnaud.controller.carte.Carte;
import be.ieps.poo.arnaud.model.decorator.accompagnement.Frites;
import be.ieps.poo.arnaud.model.decorator.dessert.Cafe;
import be.ieps.poo.arnaud.model.factory.PlatFactory;
import be.ieps.poo.arnaud.model.plats.Plat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestMenu {
    private PlatFactory factory = new PlatFactory();

    private MenuController menuController = new MenuController(new Carte(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

    @Test
    void configurationMenu() {
        Plat menu = factory.getPlat("viande");
        menu.setType("blanc bleu");
        menu.setPrix(15.00);
        menu = new Cafe(new Frites(menu));
        System.out.println(menu.getPreparation());
        System.out.println("avant ajout plat 1: " + menuController.getCommandes(1).size());
        menuController.ajoutMenuCommande(1, menu);

        System.out.println("avant ajout plat 2: " + menuController.getCommandes(1).size());
        menu = factory.getPlat("poisson");
        menu.setType("sole");
        menu.setPrix(10.00);
        menuController.ajoutMenuCommande(2, menu);
        System.out.println("avant ajout plat 3: " +menuController.getCommandes(2).size());
        menu = factory.getPlat("poisson");
        menu.setType("sole");
        menu.setPrix(10.00);
        menuController.ajoutMenuCommande(2, menu);
        System.out.println("apres ajout plat 3: " +menuController.getCommandes(2).size());
        menuController.nombreMenuCommande();
/*        for (Plat plat : menuController.getCommandes(1)) {
            System.out.println(plat.getPreparation());
            System.out.println(plat.getPrix());
        }*/
        System.out.println(menuController.prixTotalCommande(1));
    }
}
