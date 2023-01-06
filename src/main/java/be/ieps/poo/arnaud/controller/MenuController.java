package be.ieps.poo.arnaud.controller;

import be.ieps.poo.arnaud.controller.carte.*;
import be.ieps.poo.arnaud.model.plats.Plat;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuController {
    private Map<Integer, ArrayList<Plat>> listeCommande = new HashMap<>();
    private Carte carte;

    public MenuController(Carte carte) {
        this.carte = carte;
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

    /**
     * @param table la table de la commande
     */
    public double prixTotalCommande(int table) {

        if (!listeCommande.containsKey(table)) return 0;

        double prixTotal = 0;
        for (Plat plat : listeCommande.get(table)) {
            prixTotal += plat.getPrix();
        }

        return prixTotal;
    }
}

