package L03_03_2025.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryStudents {
    private static final Random random = new Random(100);
    private static List<String> names = List.of("Vany", "Marina", "Katy", "Maks", "Sasha", "Dima");


    public static Student next() {
        String names = next().getName();
        return new Student(names, next().getAge(), next().getGrade());
    }
}

