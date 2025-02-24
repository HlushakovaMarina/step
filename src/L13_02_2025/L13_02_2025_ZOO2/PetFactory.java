package L13_02_2025.L13_02_2025_ZOO2;

import java.util.Random;

public class PetFactory {

    private static String[] dogNames = { "Рекс", "Амур", "Джерик", "Палкан" };

    private static String[] catNames = { "Баксик", "Кити", "Мартик", "Мурка" };

    private static String[] birdNames = { "Кеша", "Чижик", "Коко", "Рио" };

    private static Random random = new Random();

    public static Pet next() {
        int i = random.nextInt(3);
        if (i == 2) {
            return new Cat(catNames[random.nextInt(catNames.length)], random.nextInt(10));
        } else if (i == 1) {
            return new Dog(dogNames[random.nextInt(dogNames.length)], random.nextInt(10));
        } else {
            return new Bird(birdNames[random.nextInt(birdNames.length)], random.nextInt(10));
        }
    }
}
