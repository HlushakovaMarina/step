package L10_02_2025.ZOO;

public abstract class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void sleep();


    @Override
    public String toString() {
        return species + " по имени " + name + ", " + "возраст: " + age;
    }
}


