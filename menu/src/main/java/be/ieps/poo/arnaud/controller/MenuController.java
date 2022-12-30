package be.ieps.poo.arnaud.controller;

import be.ieps.poo.arnaud.controller.carte.*;
import be.ieps.poo.arnaud.model.plats.Plat;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuController {
    public HashMap<String, ArrayList<Plat>> listeCommande;
    public String nomFichier = "carte.xml";
    Loader loader = new Loader(nomFichier);
    public void initialisationCarte(){
        loader.recuperationPlats();
        loader.recuperationAccompagnements();
        loader.recuperationDesserts();
    }

    public void initialisationCommande() {
        listeCommande = new HashMap<>();
        listeCommande.put("Table 1", new ArrayList<>());
        listeCommande.put("Table 2", new ArrayList<>());
        listeCommande.put("Table 3", new ArrayList<>());
        listeCommande.put("Table 4", new ArrayList<>());
        listeCommande.put("Table 5", new ArrayList<>());
    }

    public void ajoutMenuCommande(String table, Plat plat) {

        listeCommande.get("Table 1").add(plat);
    }

    public void nombreMenuCommande() {
        int nbMenuCommande = 0;
        for (ArrayList<Plat> arLisPlats : listeCommande.values()) {
            nbMenuCommande += arLisPlats.size();
        }
        System.out.println("Nb plat : " + nbMenuCommande);
        /*       return nbMenuCommande;*/
    }

    public Double prixTotalCommande() {
        Double prixTotal = 0.00;
        for (Plat plat : listeCommande.get("Table 1")){

            prixTotal += plat.getPrix();
        }

        return prixTotal;
    }
}

