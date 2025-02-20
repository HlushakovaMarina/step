package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;

public abstract class Animal {
    protected int id; // Уникальный индификатор
    private String name;
    private String species;
    private int age;
    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;//начало с 1, а не с нуляю
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



    public String toString() {
        return species + " по имени " + name +
                ", " + "возраст: " + age + " (ID: " + id + ")";
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}


