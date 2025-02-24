package L13_02_2025.L13_02_2025_ZOO2;

public abstract class WildAnimal extends Animal {

    private String habitat;

    public WildAnimal(String name, String species, int age, String habitat) {
        super(name, species, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void hunt() {
        System.out.println(getName() + " охотится в " + habitat + ".");
    }

    @Override
    public String toString() {
        return super.toString() + " (Дикое животное, среда обитания: " + habitat + ")";
    }
}
