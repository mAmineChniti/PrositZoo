package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class AnimalAquatique extends Animal {
    private String habitat;

    public AnimalAquatique() {
        super();
    }

    public AnimalAquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

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

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalAquatique)) return false;

        AnimalAquatique that = (AnimalAquatique) o;

        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }
}