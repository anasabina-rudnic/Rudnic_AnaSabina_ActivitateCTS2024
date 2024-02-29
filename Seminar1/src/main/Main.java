package main;

import clase.*;

import java.util.HashMap;

public class Main {
    public enum FeedType {
        OMNIVORE,
        HERBIVORE,
        CARNIVORE
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ion");
        Zoo zoo = new Zoo("ZOO", zooKeeper, new HashMap<>());

        Animal anotherAnimal = new Zebra("Marty", 21);
        zoo.addAnimal(anotherAnimal, "grass");

        zoo.addAnimal(new Lion("Simba", 10), "Marty");

        zoo.addAnimal(new Cat("Tom", 2), "Kibbles");

        zoo.feedAllAnimals();

        FeedType feedType = FeedType.CARNIVORE;
    }
}