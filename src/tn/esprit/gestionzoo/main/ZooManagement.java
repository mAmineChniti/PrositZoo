package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        // Création d'animaux terrestres
        Animal lion = new Animal("Felidae", "Simba", 8, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal dog2 = new Animal("Canine", "Goldy", 2, true);

        // Création d'animaux aquatiques
        AnimalAquatique genericAquatic = new AnimalAquatique("Cetacea", "Unknown Aquatic", 5, true, "Ocean");
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctic", 200.0f);

        // Création des zoos
        Zoo myZoo = new Zoo("Wildlife Park", "Bizerte");
        Zoo notMyZoo = new Zoo("WaterPark", "Tunis");

        // Ajout d'animaux au zoo
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.addAnimal(dog2));
        System.out.println(myZoo.addAnimal(genericAquatic));
        System.out.println(myZoo.addAnimal(dolphin));
        System.out.println(myZoo.addAnimal(penguin));

        // Affichage des animaux dans le zoo
        myZoo.displayAnimals();

        // Recherche d'animaux
        System.out.println("Searching for Snoopy: " + myZoo.searchAnimal(dog));
        System.out.println("Searching for Goldy: " + myZoo.searchAnimal(dog2));

        // Suppression d'un animal
        System.out.println("Removing Snoopy: " + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        // Ajout d'animaux à nouveau
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        // Suppression d'animaux
        System.out.println("Removing Simba: " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("Removing Goldy: " + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("Removing Snoopy: " + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        // Comparaison de zoos
        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));

        // Vérification si le zoo est plein
        System.out.println("Is myZoo full? " + myZoo.isZooFull());

        // Affichage des animaux aquatiques avec swim()
        System.out.println("\n--- Testing swim() method ---");
        genericAquatic.swim();
        dolphin.swim();
        penguin.swim();

        // Affichage des objets avec toString()
        System.out.println("\n--- Displaying toString() outputs ---");
        System.out.println(genericAquatic.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
    }
}