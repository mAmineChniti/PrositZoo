package tn.esprit.gestionzoo.entities;

public class AnimalAquatique extends Animal {
    private String habitat; // Habitat de l'animal aquatique

    public AnimalAquatique() {
        super();
    }

    public AnimalAquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Getters et Setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + '\'' + '}';
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}