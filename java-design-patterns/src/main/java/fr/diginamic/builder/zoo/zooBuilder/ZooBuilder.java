package fr.diginamic.builder.zoo.zooBuilder;

import fr.diginamic.builder.zoo.Animal;
import fr.diginamic.builder.zoo.Zone;
import fr.diginamic.builder.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooBuilder {

    private String nom;
    private List<Zone> zones;

    public ZooBuilder(String nom) {
        this.nom = nom;
        this.zones = new ArrayList<Zone>();
    }

    public void appendZone(String nom, Integer capacite) {
        this.zones.add(new Zone(nom, capacite));
    }

    public void appendAnimal(String nomZone, Animal animal) {
        for (int i = 0; i < this.zones.size(); i++) {

            Zone zone = zones.get(i);

            if(zone.getNom().equals(nomZone)) {

                if(zone.getAnimals().size() >= zone.getCapacite()) {
                    throw new IllegalStateException("La capacité maximale de la zone est atteinte !");
                }

                List<Animal> animals = zone.getAnimals();
                animals.add(animal);
                zone.setAnimals(animals);

                break;
            }
        }
    }

    public Zoo get(){
        return new Zoo(nom, zones);
    }

}
