package org.example.animalExercise;

import java.util.ArrayList;
import java.util.List;

public class ShelterWorker {
    private String name;
    private String surname;
    private int id;
     List<Animal> animals = new ArrayList();

    public ShelterWorker(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setShelterWorker(this);


    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public String toString() {
        return "ShelterWorker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", animals=" + animals +
                '}';
    }
}



