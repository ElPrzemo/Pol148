package org.example.animalExercise;

public class Main {

    public static void main(String[] args) {


        ShelterWorker shelterWorker = new ShelterWorker("Jakub", "Wędrowycz", 1);

        Animal animal = new Animal(1, "Fox", 2);
        Animal animal2 = new Animal(2, "Dog", 1);
        Animal animal3 = new Animal(3, "Cat", 6);

        shelterWorker.addAnimal(animal);
        shelterWorker.addAnimal(animal2);
        shelterWorker.addAnimal(animal3);

        System.out.println(shelterWorker.toString());
    }
}
