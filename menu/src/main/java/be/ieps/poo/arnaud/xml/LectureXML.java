
package be.ieps.poo.arnaud.xml;

import be.ieps.poo.arnaud.controller.MenuController;
import be.ieps.poo.arnaud.controller.carte.Loader;
import be.ieps.poo.arnaud.model.plats.Plat;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.security.PrivilegedActionException;
import java.util.Iterator;
import java.util.List;

public class LectureXML {
    public Document document;
    public Element racine;


    public LectureXML(String nomFichier) {
        //Création une instance de SAXBuilder
        SAXBuilder saxBuilder = new SAXBuilder();
        try {
            //Création d'un document JDOM avec en argument le fichier XML
            document = saxBuilder.build(new File(nomFichier));
        } catch (JDOMException | IOException e) {
            System.out.println("Erreur : " + e);
        }
        //Création de l'élément racine à partir du document.
        racine = document.getRootElement();

    }


    public void affichePlat() {
        System.out.println();
        System.out.println("=============== Affichage des plats ==============");
        System.out.println();

        //Création d'une liste contenant tous les noeuds "plat" de l'Element racine
        List<Element> listePlat = racine.getChildren("plat");

        for (Element plat : listePlat) {
            System.out.println("Catégorie: " + plat.getAttributeValue("categorie"));
            System.out.println("Type: " + plat.getChild("type").getText());
            System.out.println("Prix: " + plat.getChild("prix").getText());
        }
    }
    public void afficheAccompagnement() {
        System.out.println();
        System.out.println("=============== Affichage des accompagnements ==============");
        System.out.println();

        //Création d'une liste contenant tous les noeuds "plat" de l'Element racine
        List<Element> listeAccompagnement = racine.getChildren("accompagnement");

        for (Element accompagnement : listeAccompagnement) {
            System.out.println("Catégorie: " + accompagnement.getAttributeValue("categorie"));
            System.out.println("Type: " + accompagnement.getChild("type").getText());
            System.out.println("Prix: " + accompagnement.getChild("prix").getText());
        }
    }
    public void afficheDessert() {
        System.out.println();
        System.out.println("=============== Affichage des desserts ==============");
        System.out.println();

        //Création d'une liste contenant tous les noeuds "plat" de l'Element racine
        List<Element> listeDessert = racine.getChildren("dessert");

        for (Element dessert : listeDessert) {
            System.out.println("Catégorie: " + dessert.getAttributeValue("categorie"));
            System.out.println("Type: " + dessert.getChild("type").getText());
            System.out.println("Prix: " + dessert.getChild("prix").getText());
        }
    }
}


