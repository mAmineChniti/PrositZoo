package tn.esprit.gestionzoo.entities;

public class Dolphin extends AnimalAquatique {
    private float swimmingSpeed; // Vitesse de nage du dauphin

    public Dolphin() {
        super();
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getters et Setters
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", swimmingSpeed=" + swimmingSpeed + '}';
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}