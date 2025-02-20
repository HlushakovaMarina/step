package L10_02_2025.ZOO;

public abstract class WildAnimal extends Animal implements WildAnimalActions {
    private String habitat;

    public WildAnimal(String name, String species, int age, String habitat) {
        super(name, species, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " (Дикое животное, среда обитания: " + habitat + ")";
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится в " + habitat + ".");
    }

}
