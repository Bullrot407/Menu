package be.ieps.poo.arnaud;


import be.ieps.poo.arnaud.decorator.*;
import be.ieps.poo.arnaud.factory.PlatFactory;
import be.ieps.poo.arnaud.plats.Plat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StartMenuTest {

    private static PlatFactory factory;
    static Plat plat;

    @BeforeAll
    static void initialisation() {
        factory = new PlatFactory();
    }

@Order(1)
    @Test
    void testPlatSansDecorateur() {

        plat = factory.getPlat("viande");

        assertAll("viande",
                () -> assertEquals("viande", plat.getType()),
                () -> assertEquals(new Double(10.0), plat.getPrix()));
    }

    @Order(2)
    @Test
    void testPlatAvecDecorateurFrites() {

        plat = new Frites(factory.getPlat("viande"));

        assertAll("viande",
                () -> assertEquals("viande frites", plat.getPreparation()),
                () -> assertEquals(new Double(15.0), plat.getPrix()));
    }
    @Order(3)
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
}
