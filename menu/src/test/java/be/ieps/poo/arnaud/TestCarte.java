package be.ieps.poo.arnaud;

import be.ieps.poo.arnaud.controller.MenuController;
import be.ieps.poo.arnaud.controller.carte.Carte;
import be.ieps.poo.arnaud.controller.carte.Choix;
import be.ieps.poo.arnaud.controller.carte.Loader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class TestCarte {
    private static Loader loader;

    public TestCarte(){

    }
    @BeforeAll
    public static void initialiationXML(){
        loader = new Loader("carteTest.xml");
    }

    @Order(1)
    @Test
    public void TestLoadingPlats(){
        loader.recuperationPlats();

        ArrayList listePlats = Carte.getInstance().getListePlats();
        assertEquals(3,listePlats.size());

        Choix platTest = (Choix) listePlats.get(1);
        assertEquals("viande",platTest.getCategorie());
        assertEquals("boeuf",platTest.getType());
        assertEquals(15.0,platTest.getPrix());
        assertEquals("au grill",platTest.getDescription());
    }
    @Order(2)
    @Test
    public void TestLoadingAccompagnements(){
        loader.recuperationAccompagnements();

        ArrayList listeAccompagnements = Carte.getInstance().getListeAccompagnements();
        assertEquals(4,listeAccompagnements.size());

        Choix platTest = (Choix) listeAccompagnements.get(1);
        assertEquals("riz",platTest.getCategorie());
        assertEquals("basmati",platTest.getType());
        assertEquals(5.0,platTest.getPrix());
        assertEquals("à la japonaise",platTest.getDescription());
    }
    @Order(3)
    @Test
    public void TestLoadingDesserts(){
        loader.recuperationDesserts();

        ArrayList listeDesserts = Carte.getInstance().getListeDesserts();
        assertEquals(4,listeDesserts.size());

        Choix platTest = (Choix) listeDesserts.get(1);
        assertEquals("fruit",platTest.getCategorie());
        assertEquals("pomme",platTest.getType());
        assertEquals(5.0,platTest.getPrix());
        assertEquals("pomme sucrée",platTest.getDescription());
    }
}

