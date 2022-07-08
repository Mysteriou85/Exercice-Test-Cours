package fr.diginamic.builder.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nom;
    private Integer capacite;
    private List<Animal> animals;

    public Zone(String nom, Integer capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.animals = new ArrayList<Animal>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zone{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", capacite=").append(capacite);
        sb.append(", animals=").append(animals);
        sb.append('}');
        return sb.toString();
    }
}
