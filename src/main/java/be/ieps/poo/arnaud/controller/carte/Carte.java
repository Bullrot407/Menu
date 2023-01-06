package be.ieps.poo.arnaud.controller.carte;

import java.util.ArrayList;


public class Carte {
    private static volatile Carte instance;
    private ArrayList<Choix> listePlats;
    private ArrayList<Choix> listeAccompagnements;
    private ArrayList<Choix> listeDesserts;

    private Carte() {
    }

    public static Carte getInstance() {
// Double lock for thread safety.
        if (instance == null) {
            instance = new Carte();
        }
        return instance;
    }

    public Choix getPlat(String categorie) {
        Choix plat = null;
        for (Choix objet : listePlats) {
            if(objet.getCategorie().equals(categorie)){
                plat = objet;
            }
        }
        return plat;
    }
    public Choix getAccompagnement(String categorie) {
        Choix accompagnement = null;
        for (Choix objet : listePlats) {
            if(objet.getCategorie().equals(categorie)){
                accompagnement = objet;
            }
        }
        return accompagnement;
    }
    public Choix getDessert(String categorie) {
        Choix dessert = null;
        for (Choix objet : listePlats) {
            if(objet.getCategorie().equals(categorie)){
                dessert = objet;
            }
        }
        return dessert;
    }
    public ArrayList<Choix> getListePlats() {
        return listePlats;
    }

    public void setListePlats(ArrayList<Choix> listePlats) {
        this.listePlats = listePlats;
    }

    public ArrayList<Choix> getListeAccompagnements() {
        return listeAccompagnements;
    }

    public void setListeAccompagnements(ArrayList<Choix> listeAccompagnements) {
        this.listeAccompagnements = listeAccompagnements;
    }

    public ArrayList<Choix> getListeDesserts() {
        return listeDesserts;
    }

    public void setListeDesserts(ArrayList<Choix> listeDesserts) {
        this.listeDesserts = listeDesserts;
    }
}
