package fr.diginamic.factory.factory;

import fr.diginamic.factory.categorie.ObjetConnecte;
import fr.diginamic.factory.objets.EnceinteConnectee;
import fr.diginamic.factory.objets.Tablette;
import fr.diginamic.factory.objets.TelephonePortable;
import fr.diginamic.factory.types.TypeObjet;

public class ObjetConnecteFactory {
    public static ObjetConnecte getObjetConnecte(Enum<TypeObjet> type) {
        if(type.equals(TypeObjet.PORTABLE)) {
            return new TelephonePortable(5);
        } else if (type.equals(TypeObjet.TABLETTE)) {
            return new Tablette(5);
        } else if (type.equals(TypeObjet.ENCEINTE)) {
            return new EnceinteConnectee(12);
        }
        return null;
    }
}
