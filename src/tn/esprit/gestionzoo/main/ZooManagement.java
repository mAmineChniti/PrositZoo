package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.setAge(8);
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Bizerte");
        Zoo notMyZoo = new Zoo("WaterPark", "Tunis");

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Goldy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
        System.out.println(myZoo.isZooFull());
    }
}
