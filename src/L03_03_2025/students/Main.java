package L03_03_2025.students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(100);


        boolean isDimaContains = students.contains("Dima");
        System.out.println(isDimaContains);

    }
}
