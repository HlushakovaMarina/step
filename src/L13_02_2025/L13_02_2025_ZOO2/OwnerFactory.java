package L13_02_2025.L13_02_2025_ZOO2;

import java.util.Random;

public class OwnerFactory {
    private static String[] firstNames = {"Анна", "Глеб", "Макс", "Кристина"};
    private static String[] lastNames = {"Беляков", "Иванова", "Частухина", "Сидоров", "Васечкин"};

    private static Random random = new Random();

    public static Owner next() {
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return new Owner(firstName, lastName);
    }
}