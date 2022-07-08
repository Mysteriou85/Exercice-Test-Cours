package fr.diginamic.facade.library;

public class MachineAPopcorn {
    boolean enFonctionnement;

    public void marche() {
        enFonctionnement = true;
        System.out.println("La machine à pop corn est en marche");
    }

    public void arret() {
        enFonctionnement = false;
        System.out.println("La machine à pop corn est à l'arrêt");
    }

    public void eclater() {
        System.out.println("Fait éclater du pop corn");
    }
}
