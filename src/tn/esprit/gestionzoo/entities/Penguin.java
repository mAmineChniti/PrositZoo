package tn.esprit.gestionzoo.entities;

public class Penguin extends AnimalAquatique {
    private float swimmingDepth; // Profondeur de nage du pingouin

    public Penguin() {
        super();
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getters et Setters
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", swimmingDepth=" + swimmingDepth + '}';
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}