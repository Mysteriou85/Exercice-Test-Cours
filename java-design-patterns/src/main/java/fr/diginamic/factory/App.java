package fr.diginamic.factory;

import fr.diginamic.factory.categorie.ObjetConnecte;
import fr.diginamic.factory.factory.ObjetConnecteFactory;
import fr.diginamic.factory.types.TypeObjet;

public class App {
    public static void main(String[] args) {

        ObjetConnecte objPortable = ObjetConnecteFactory.getObjetConnecte(TypeObjet.PORTABLE);
        ObjetConnecte objTablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);
        ObjetConnecte objEnceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE);
        ObjetConnecte objMontre = ObjetConnecteFactory.getObjetConnecte(TypeObjet.MONTRE);

        System.out.println(objPortable.getClass());
        System.out.println(objTablette.getClass());
        System.out.println(objEnceinte.getClass());
        System.out.println(objMontre);

    }
}
