package fr.diginamic.facade.library;

public class Amplificateur {

    Tuner tuner;
    LecteurDvd lecteurDvd;
    LecteurCd lecteurCd;

    // Constructor
    public Amplificateur() {
    }

    public Amplificateur(Tuner tuner, LecteurDvd lecteurDvd, LecteurCd lecteurCd) {
        this.tuner = tuner;
        this.lecteurDvd = lecteurDvd;
        this.lecteurCd = lecteurCd;
    }

    // Getter & Setter
    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public LecteurDvd getLecteurDvd() {
        return lecteurDvd;
    }

    public void setLecteurDvd(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    public LecteurCd getLecteurCd() {
        return lecteurCd;
    }

    public void setLecteurCd(LecteurCd lecteurCd) {
        this.lecteurCd = lecteurCd;
    }

    // Methode
    public void marche() {
        System.out.println("L'amplificateur est allumée");
    }

    public void arret() {
        System.out.println("L'amplificateur est etteind");
    }

    public void setCd() {
        System.out.println("Set du cd dans l'amplificateur");
    }

    public void setDvd() {
        System.out.println("Set du dvd dans l'amplificateur");
    }

    public void setSonStereo() {
        System.out.println("Set le son stereo de l'amplificateur");
    }

    public void setSonSurrond() {
        System.out.println("Set le son surrond de l'amplificateur");
    }

    public void setTunner() {
        System.out.println("Set le tunner l'amplificateur");
    }

    public void setVolume(Integer volume) {
        System.out.println("Set le volume de l'amplificateur à" + volume + ".");
    }

}
