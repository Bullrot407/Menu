package be.ieps.poo.arnaud.controller.carte;

import java.io.File;

public interface Loader {

    Carte load(File file) throws LoadingException;
}
