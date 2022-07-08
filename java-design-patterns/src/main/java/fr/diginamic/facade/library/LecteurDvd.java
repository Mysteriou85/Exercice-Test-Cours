package fr.diginamic.facade.library;

public class LecteurDvd {

    Amplificateur amplificateur;

    // Constructor
    public LecteurDvd() {
    }

    public LecteurDvd(Amplificateur amplificateur) {
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
    public void marche() {

    }

    public void arret() {
        System.out.println("Le lecteur DVD est éteint");
    }

    public void ejecter(String film) {
        System.out.println("ejecter " + film + ".");
    }

    public void pause(String film) {
        System.out.println("" + film + " est en pause.");
    }

    public void jouer(String film) {
        System.out.println("Jouer le film" + film + ".");
    }

    public void setAudioSurround() {
        System.out.println("L'audio (surround) est set");
    }

    public void setAudioStereo() {
        System.out.println("L'audio (stereo) est set");
    }

    public void stop() {
        System.out.println("Le film est arrêté");
    }

}
