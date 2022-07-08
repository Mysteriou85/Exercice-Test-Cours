package fr.diginamic.builder;

import fr.diginamic.builder.zoo.Zoo;
import fr.diginamic.builder.zoo.zooBuilder.ZooBuilder;
import fr.diginamic.builder.director.Director;

public class ZooBuilderTest {
    public static void main(String[] args) {

        Director director = new Director();

        String nomDuZoo = "Beauval";
        ZooBuilder zooBeauvalBuilder= new ZooBuilder(nomDuZoo);

        director.constructZooBeauval(zooBeauvalBuilder);

        Zoo zooBeauval = zooBeauvalBuilder.get();

        System.out.println(zooBeauval);

    }
}
