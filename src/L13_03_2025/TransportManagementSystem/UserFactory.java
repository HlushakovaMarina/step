
package L13_03_2025.TransportManagementSystem;


import java.util.List;
import java.util.Random;

public class UserFactory {
    private static final Random num = new Random();
    private static List<String> names = List.of("Крис", "Дима", "Саша", "Маша", "Женя");

    public static User next() {
        String randomName = names.get(num.nextInt(names.size()));
        return new User(randomName);
    }
}