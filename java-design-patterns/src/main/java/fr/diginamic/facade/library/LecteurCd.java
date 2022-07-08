package fr.diginamic.facade.library;

public class LecteurCd {

    Amplificateur amplificateur;

    // Constructor
    public LecteurCd() {
    }

    public LecteurCd(Amplificateur amplificateur) {
        this.amplificateur = amplificateur;
    }

    // Getter & Setter
    public Amplificateur getAmplificateur() {
        return amplificateur;
    }

    public void setAmplificateur(Amplificateur amplificateur) {
        this.amplificateur = amplificateur;
    }

    // Methode
    public void marche( ) {
        System.out.println("Le lecteur CD est allumé");
    }

    public void arret() {
        System.out.println("Le lecteur CD est eteind");

    }

    public void ejecter() {
        System.out.println("Le CD est ejecter");
    }

    public void pause() {
        System.out.println("Le CD est en pause");
    }

    public void jouer(String film) {
        System.out.println("Le film " + film + " est jouée");
    }

    public void stop() {
        System.out.println("Le CD est arrêté");
    }
}
