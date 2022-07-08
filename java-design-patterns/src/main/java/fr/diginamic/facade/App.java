package fr.diginamic.facade;

import fr.diginamic.facade.facade.FacadeHomeCinema;
import fr.diginamic.facade.library.*;

public class App {
    static FacadeHomeCinema facadeHomeCinema = new FacadeHomeCinema();

    public static void main(String[] args) {

        Amplificateur amplificateur = new Amplificateur();
        Ecran ecran = new Ecran();
        LecteurCd lecteurCd = new LecteurCd();
        LecteurDvd lecteurDvd = new LecteurDvd();
        Lumieres lumieres = new Lumieres();
        MachineAPopcorn machineAPopcorn = new MachineAPopcorn();
        Projecteur projecteur = new Projecteur();
        Tuner tuner = new Tuner();

        String film = "Crêpe";
        Integer volume = 5;

        facadeHomeCinema.regarderFilm(machineAPopcorn, lumieres, projecteur, amplificateur, lecteurDvd, volume, film);

        facadeHomeCinema.arreterFilm(machineAPopcorn, lumieres, projecteur, amplificateur, lecteurDvd, film);
    }
}
