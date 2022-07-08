package fr.diginamic.builder.zoo;

import java.util.List;

public class Zoo {
    private String nom;
    private List<Zone> zones;

    public Zoo(String nom, List<Zone> zones) {
        this.nom = nom;
        this.zones = zones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", zones=").append(zones);
        sb.append('}');
        return sb.toString();
    }
}
