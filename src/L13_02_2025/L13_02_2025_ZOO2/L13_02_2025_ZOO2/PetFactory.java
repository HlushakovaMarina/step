package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;

import java.util.Random;

public class PetFactory {

    private static String[] petTypes = {"Dog", "Cat", "Bird"};
    private static String[] dogNames = {"Рекс", "Амур", "Джерик", "Палкан"};
    private static String[] catNames = {"Баксик", "Кити", "Мартик", "Мурка"};
    private static String[] birdNames = {"Кеша", "Чижик", "Коко", "Рио"};
    private static Random random = new Random();

    public static String[] getPetTypes() {
        return petTypes;
    }

    public static String[] getDogNames() {
        return dogNames;
    }

    public static String[] getCatNames() {
        return catNames;
    }

    public static String[] getBirdNames() {
        return birdNames;
    }

    static Pet next() {
        String type = petTypes[random.nextInt(petTypes.length)];

        return new Pet();
    }
}
