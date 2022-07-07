package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class SingletonTest {
    public static void main(String[] args) {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
        String valeur = configuration.getString("db.url");

        String valeur2 = "autre";

        Singleton singleton = Singleton.getInstance(valeur);
        Singleton otherSingleton = Singleton.getInstance(valeur2);

        System.out.println(singleton.value);
        // Affiche la même valeur que singleton.value
        System.out.println(otherSingleton.value);

        System.out.println(valeur);
    }
}
