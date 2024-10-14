package tn.esprit.gestionzoo.entities;

public class AnimalTerrestre extends Animal {
    private int nbrLegs; // Nombre de pattes de l'animal terrestre

    public AnimalTerrestre() {
        super();
    }

    public AnimalTerrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getters et Setters
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs + '}';
    }
}