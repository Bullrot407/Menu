package be.ieps.poo.arnaud;

import be.ieps.poo.arnaud.controller.MenuController;
import be.ieps.poo.arnaud.controller.carte.Carte;
import be.ieps.poo.arnaud.xml.LectureXML;

public class StartMenu {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();

        menuController.initialisationCarte();
        for (int i = 0; i < 3; i++) {
            System.out.println(Carte.getInstance().getListePlats().get(i).getCategorie());
            System.out.println(Carte.getInstance().getListePlats().get(i).getType());
            System.out.println(Carte.getInstance().getListePlats().get(i).getPrix());
            System.out.println(Carte.getInstance().getListePlats().get(i).getDescription());
        }

        System.out.println("=================================================");
        for (int i = 0; i < 3; i++) {
            System.out.println(Carte.getInstance().getListeAccompagnements().get(i).getCategorie());
            System.out.println(Carte.getInstance().getListeAccompagnements().get(i).getType());
            System.out.println(Carte.getInstance().getListeAccompagnements().get(i).getPrix());
            System.out.println(Carte.getInstance().getListeAccompagnements().get(i).getDescription());
        }
        System.out.println("=================================================");
        for (int i = 0; i < 3; i++) {
            System.out.println(Carte.getInstance().getListeDesserts().get(i).getCategorie());
            System.out.println(Carte.getInstance().getListeDesserts().get(i).getType());
            System.out.println(Carte.getInstance().getListeDesserts().get(i).getPrix());
            System.out.println(Carte.getInstance().getListeDesserts().get(i).getDescription());
        }
    }
/*

        LectureXML fichierXML = new LectureXML();

        fichierXML.affichePlat();
        fichierXML.afficheAccompagnement();
        fichierXML.afficheDessert();
*/
}
