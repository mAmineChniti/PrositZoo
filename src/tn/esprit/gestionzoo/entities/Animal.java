package tn.esprit.gestionzoo.entities;

public class Animal {

    public String family;
    public String name;
    public boolean isMammal;
    private int age;


    public Animal() {
        // TODO
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal +
                '}';
    }
}
