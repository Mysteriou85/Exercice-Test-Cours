package fr.diginamic.factory2.factory;

import fr.diginamic.factory2.categorie.ObjetConnecte;
import fr.diginamic.factory2.objets.EnceinteConnectee;
import fr.diginamic.factory2.objets.Tablette;
import fr.diginamic.factory2.objets.TelephonePortable;
import fr.diginamic.factory2.type.TypeObjet;

public class ObjetConnecteFactory {

    public static ObjetConnecte getObjetConnecte(Enum<TypeObjet> type) {
        if(type.equals(TypeObjet.PORTABLE)) {
            return new TelephonePortable(5);
        } else if (type.equals(TypeObjet.TABLETTE)) {
            return new Tablette(5);
        } else if (type.equals(TypeObjet.ENCEINTE)) {
            return new EnceinteConnectee(25);
        }
        return  null;
    }

}
