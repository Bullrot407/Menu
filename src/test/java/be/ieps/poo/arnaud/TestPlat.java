package be.ieps.poo.arnaud;


import be.ieps.poo.arnaud.controller.MenuController;

import be.ieps.poo.arnaud.model.decorator.accompagnement.Frites;
import be.ieps.poo.arnaud.model.decorator.accompagnement.Riz;
import be.ieps.poo.arnaud.model.decorator.dessert.Cafe;
import be.ieps.poo.arnaud.model.decorator.dessert.Glace;
import be.ieps.poo.arnaud.model.plats.Plat;

;
import be.ieps.poo.arnaud.model.factory.PlatFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlat {
    private static MenuController menuController;
    private static PlatFactory factory;
    static Plat plat, menu;

    @BeforeAll
    static void initialisation() {
        factory = new PlatFactory();
        menuController = new MenuController();
        menuController.initialisationCommande();
    }

    @Order(1)
    @Test
    void testPlatSansDecorateur() {

        plat = factory.getPlat("viande");
        plat.setType("blanc bleu");
        plat.setPrix(15.00);

        assertAll("viande",
                () -> assertEquals("blanc bleu", plat.getType()),
                () -> assertEquals(15.00, plat.getPrix()),
                () -> assertEquals("Piece de blanc bleu de 300gr cuite sur pierre", plat.getPreparation())
        );
    }


    @Order(2)
    @Test
    void testPlatAvecDecorateurFrites() {
        plat = factory.getPlat("viande");
        plat.setType("blanc bleu");
        plat.setPrix(15.00);
        plat = new Frites(plat);

        assertAll("viande",
                () -> assertEquals(plat.getPrix(), 20.00),
                () -> assertEquals("Piece de blanc bleu de 300gr cuite sur pierre accompagné de frites", plat.getPreparation()));
    }

    @Order(3)
    @Test
    void testPlatAvecDecorateurFritesCafe() {

        plat = factory.getPlat("viande");
        plat.setType("blanc bleu");
        plat.setPrix(15.00);
        plat = new Frites(plat);
        plat = new Cafe(plat);

        assertAll("viande",
                () -> assertEquals("Piece de blanc bleu de 300gr cuite sur pierre accompagné de frites accompagné d'un café latte", plat.getPreparation()),
                () -> assertEquals(25, plat.getPrix()));
    }


    @Order(4)
    @Test
    void configurationMenu() {
        menu = factory.getPlat("viande");
        menu.setType("blanc bleu");
        menu.setPrix(15.00);
        menu = new Frites(menu);
        menu = new Cafe(menu);

        menuController.ajoutMenuCommande("table 01", menu);

        menu = factory.getPlat("poisson");
        menu.setType("sole");
        menu.setPrix(10.00);
        menu = new Riz(menu);
        menu = new Glace(menu);

        menuController.ajoutMenuCommande("table 1", menu);
        menuController.nombreMenuCommande();
        for (Plat plat : menuController.listeCommande.get("Table 1")) {
            System.out.println(plat.getPreparation());
            System.out.println(plat.getPrix());
        }
        System.out.println(menuController.prixTotalCommande());
    }
}

    /*
     @Order(4)
    @Test
    void testPlatAvecDecorateurPommeDeTerre() {

        plat = new PommeDeTerre(factory.getPlat("poisson"));

        assertAll("poisson",
                () -> assertEquals("poisson pomme de terre", plat.getPreparation()),
                () -> assertEquals(new Double(20.0), plat.getPrix()));
    }

    @Order(4)
    @Test
    void testPlatAvecDecorateurPates() {

        plat = new Pates(factory.getPlat("volaille"));

        assertAll("volaille",
                () -> assertEquals("volaille pates", plat.getPreparation()),
                () -> assertEquals(new Double(12.0), plat.getPrix()));
    }

    @Order(5)
    @Test
    void testPlatAvecDecorateurRiz() {

        plat = new Riz(factory.getPlat("viande"));

        assertAll("viande",
                () -> assertEquals("viande riz", plat.getPreparation()),
                () -> assertEquals(new Double(15.0), plat.getPrix()));
    }

    @Order(6)
    @Test
    void testPlatAvecDecorateurRizCafe() {

        plat = new Cafe(new Riz(factory.getPlat("viande")));

        assertAll("viande",
                () -> assertEquals("viande riz Cafe", plat.getPreparation()),
                () -> assertEquals(new Double(20.0), plat.getPrix()));
    }*/

