package be.ieps.poo.arnaud.controller.carte;

import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLLoader implements Loader {

    @Override
    public Carte load(File file) throws LoadingException {
        try {
            return recuperationCarte(loadFileToXML(file));
        } catch (IOException | JDOMException | NullPointerException e) {
            throw new LoadingException(e);
        }
    }

    public Element loadFileToXML(File file) throws IOException, JDOMException {
        SAXBuilder saxBuilder = new SAXBuilder();

        return saxBuilder.build(file).getRootElement();
    }

    public Carte recuperationCarte(Element racine) {
        return new Carte(recuperationPlats(racine), recuperationAccompagnements(racine), recuperationDesserts(racine));
    }

    public ArrayList<Choix> recuperationPlats(Element racine) {
        ArrayList<Choix> choix = new ArrayList<>();

        List<Element> listePlat = racine.getChildren("plat");

        for (Element plat : listePlat) {
            String categorie = plat.getAttributeValue("categorie");
            String type = plat.getChild("type").getText();
            Double prix = Double.valueOf(plat.getChild("prix").getText());
            String description = plat.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            choix.add(obj);
        }

        return choix;
    }
    public ArrayList<Choix> recuperationAccompagnements(Element racine) {
        ArrayList<Choix> choix = new ArrayList<>();

        List<Element> listeAccompagnement = racine.getChildren("accompagnement");

        for (Element accompagnement : listeAccompagnement) {
            String categorie = accompagnement.getAttributeValue("categorie");
            String type = accompagnement.getChild("type").getText();
            Double prix = Double.valueOf(accompagnement.getChild("prix").getText());
            String description = accompagnement.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            choix.add(obj);
        }

        return choix;
    }
    public ArrayList<Choix> recuperationDesserts(Element racine) {
        ArrayList<Choix> choix = new ArrayList();


        List<Element> listeDessert = racine.getChildren("dessert");

        for (Element dessert : listeDessert) {
            String categorie = dessert.getAttributeValue("categorie");
            String type = dessert.getChild("type").getText();
            Double prix = Double.valueOf(dessert.getChild("prix").getText());
            String description = dessert.getChild("description").getText();
            Choix obj = new Choix(categorie, type, prix, description);
            choix.add(obj);
        }

        return choix;
    }
}

