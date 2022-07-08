package fr.diginamic.facade.library;

public class Projecteur {

    LecteurDvd lecteurDvd;

    // Constructor
    public Projecteur() {
    }

    public Projecteur(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    // Getter & Setter
    public LecteurDvd getLecteurDvd() {
        return lecteurDvd;
    }

    public void setLecteurDvd(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    // Methode
    public void marche() {
        System.out.println("Le projecteur est en marche");
    }

    public void arret() {
        System.out.println("Le projecteur est à l'arrêt");
    }

    public void modeTV() {
        System.out.println("Le projecteur est en mode TV");
    }

    public void modeGrandEcran() {
        System.out.println("Le projecteur est en mode Grande Ecran");
    }
}
