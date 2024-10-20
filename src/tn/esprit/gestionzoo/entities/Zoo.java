package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    static final int NUMBER_OF_AQUATIC_CAGES = 10;
    Animal[] animals;
    AnimalAquatique[] aquaticAnimals;
    String city;
    int nbrAnimals;
    int nbrAquaticAnimals;
    private String name;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new AnimalAquatique[NUMBER_OF_AQUATIC_CAGES];
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

    public boolean addAnimal(Animal animal) {
        if (nbrAnimals == NUMBER_OF_CAGES) {
            System.out.println("No more cages available for animals!");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName() + " has been added to the zoo.");
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) {
            System.out.println(animal.getName() + " not found.");
            return false;
        }
        for (int i = indexAnimal; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        System.out.println(animal.getName() + " has been removed from the zoo.");
        return true;
    }

    public boolean addAquaticAnimal(AnimalAquatique aquatic) {
        if (nbrAquaticAnimals == NUMBER_OF_AQUATIC_CAGES) {
            System.out.println("Aquatic animal cages are full!");
            return false;
        }
        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
        System.out.println(aquatic.getName() + " has been added to the aquatic section.");
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void displayAnimals() {
        System.out.println("List of animals in " + getName() + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public void displayAquaticAnimals() {
        System.out.println("List of aquatic animals in " + getName() + ":");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public boolean isAquaticZooFull() {
        return nbrAquaticAnimals == NUMBER_OF_AQUATIC_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° Animals: " + nbrAnimals;
    }
}