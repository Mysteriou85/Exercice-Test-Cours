package fr.diginamic.facade.library;

public class Tuner {

    Amplificateur amplificateur;

    // Constructor
    public Tuner() {
    }

    public Tuner(Amplificateur amplificateur) {
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
        System.out.println("Le tuner est en marche");
    }

    public void arret() {
        System.out.println("Le tuner est à l'arrêt");
    }

    public void setAm() {
        System.out.println("Set les AM");
    }

    public void setFm() {
        System.out.println("Set les FM");
    }

    public void setFrequence() {
        System.out.println("Set la fréquence");
    }
}
