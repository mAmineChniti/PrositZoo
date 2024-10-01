package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    Animal[] animals;
    String city;
    int nbrAnimals;
    private String name;

    public Zoo() {
        // TODO
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        setName(name);
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        }
    }

    void displayZoo() {
        System.out.println("Name: " + getName() + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + getName() + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (Objects.equals(animal.name, animals[i].name))
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
