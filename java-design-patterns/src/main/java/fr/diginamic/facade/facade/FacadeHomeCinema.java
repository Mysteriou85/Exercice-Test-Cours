package fr.diginamic.facade.facade;

import fr.diginamic.facade.library.*;

public class FacadeHomeCinema {

    public void regarderFilm(
            MachineAPopcorn machineAPopcorn,
            Lumieres lumieres,
            Projecteur projecteur,
            Amplificateur amplificateur,
            LecteurDvd lecteurDvd,
            Integer volume,
            String film
    ) {
        machineAPopcorn.marche();
        machineAPopcorn.eclater();
        lumieres.attenuer();
        projecteur.marche();
        projecteur.getLecteurDvd();
        projecteur.modeGrandEcran();
        amplificateur.marche();
        amplificateur.setLecteurDvd(lecteurDvd);
        amplificateur.setVolume(volume);
        lecteurDvd.marche();
        lecteurDvd.jouer(film);
    }

    public void arreterFilm(
            MachineAPopcorn machineAPopcorn,
            Lumieres lumieres,
            Projecteur projecteur,
            Amplificateur amplificateur,
            LecteurDvd lecteurDvd,
            String film
    ) {
        machineAPopcorn.arret();
        lumieres.marche();
        projecteur.arret();
        amplificateur.arret();
        lecteurDvd.ejecter(film);
        lecteurDvd.arret();
    }

    public void ecouterCd() {

    }

    public void arreterCd() {

    }

    public void ecouterRadio() {

    }

    public void arreterRadio() {

    }

}
