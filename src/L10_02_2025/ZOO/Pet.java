package L10_02_2025.ZOO;

public abstract class Pet extends Animal implements PetActions {
    private String ownersName;

    public Pet(String name, String species, int age, String ownersName) {
        super(name, species, age);
        this.ownersName = ownersName;
    }

    public String getOwnersName() {
        return ownersName;
    }

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное, хозяин: " + ownersName + ")";
    }

    public void play() {
    }
}

