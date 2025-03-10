
package L03_03_2025.students;

import L03_03_2025.students.Student;

import java.util.List;
import java.util.Random;

public class FactoryStudents {
    private static final Random num = new Random();
    private static List<String> names = List.of("Крис","Дима", "Саша", "Маша", "Женя");

    public static Student next() {
        String randomName = names.get(num.nextInt(names.size()));
        int randomAge = num.nextInt(17, 50);
        double grade = num.nextDouble(100);
        return new Student(randomName, randomAge, grade);

    }
}