package be.ieps.poo.arnaud.controller.carte;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loader {
    public Document document;

    public Element racine;

    public Loader(String nomFichier) {
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

    public void recuperationPlats() {
        ArrayList<Choix> ArrayListePlats = new ArrayList();

        /*Element elementPlats = racine.getChildren("plat").get(0);*/
        List<Element> listePlat = racine.getChildren("plat");

        for (Element plat : listePlat) {
            String categorie = plat.getAttributeValue("categorie");
            String type = plat.getChild("type").getText();
            Double prix = Double.valueOf(plat.getChild("prix").getText());
            String description = plat.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            ArrayListePlats.add(obj);
        }
        Carte carte = Carte.getInstance();
        carte.setListePlats(ArrayListePlats);
    }
    public void recuperationAccompagnements() {
        ArrayList<Choix> ArrayListeAccompagnements = new ArrayList();

        /*Element elementAccompagnements = racine.getChildren("plat").get(0);*/
        List<Element> listeAccompagnement = racine.getChildren("accompagnement");

        for (Element accompagnement : listeAccompagnement) {
            String categorie = accompagnement.getAttributeValue("categorie");
            String type = accompagnement.getChild("type").getText();
            Double prix = Double.valueOf(accompagnement.getChild("prix").getText());
            String description = accompagnement.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            ArrayListeAccompagnements.add(obj);
        }
        Carte carte = Carte.getInstance();
        carte.setListeAccompagnements(ArrayListeAccompagnements);
    }
    public void recuperationDesserts() {
        ArrayList<Choix> ArrayListeDesserts = new ArrayList();


        List<Element> listeDessert = racine.getChildren("dessert");

        for (Element dessert : listeDessert) {
            String categorie = dessert.getAttributeValue("categorie");
            String type = dessert.getChild("type").getText();
            Double prix = Double.valueOf(dessert.getChild("prix").getText());
            String description = dessert.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            ArrayListeDesserts.add(obj);
        }
        Carte carte = Carte.getInstance();
        carte.setListeDesserts(ArrayListeDesserts);
    }
}

