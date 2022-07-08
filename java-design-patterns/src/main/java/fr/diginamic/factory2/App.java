package fr.diginamic.factory2;

import fr.diginamic.factory2.categorie.ObjetConnecte;
import fr.diginamic.factory2.factory.ObjetConnecteFactory;
import fr.diginamic.factory2.type.TypeObjet;

public class App {
    public static void main(String[] args) {

        ObjetConnecte objetPortable = ObjetConnecteFactory.getObjetConnecte(TypeObjet.PORTABLE);
        ObjetConnecte objetTablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);
        ObjetConnecte objetEnceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE);

        System.out.println(objetPortable.getClass());
        System.out.println(objetTablette.getClass());
        System.out.println(objetEnceinte.getClass());
    }
}
