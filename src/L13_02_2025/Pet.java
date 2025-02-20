package L13_02_2025;

import java.util.Random;

public abstract class Pet extends Animal implements PetActions {
    private static String[] surNames = new String[5];

    private Random random = new Random();

    static {
        surNames[0] = "Петров";
        surNames[1] = "Иванова";
        surNames[2] = "Пугачева";
        surNames[3] = "Трухина";
        surNames[4] = "Белько";
    }

    private String ownersName;

    protected String ownersSurName;

    public Pet(String name, String species, int age, String ownersName) {
        super(name, species, age);
        this.ownersName = ownersName;
        this.ownersSurName = surNames[random.nextInt
                (surNames.length)];// берем рандомную фамилию из массива

    }


    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное, хозяин: " + ownersName + " " + ownersSurName + ")";
    }

    public void play() {
    }
}

