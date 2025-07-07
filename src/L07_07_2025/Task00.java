package L07_07_2025;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task00 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Анна", 18, 95.5),
                new Student("Иван", 33, 88.0),
                new Student("Мария", 26, 82.5),
                new Student("Катя", 20, 79.4),
                new Student("Олег", 26, 77.8));

        students.stream().filter(student -> student.getAge() > 20)
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .map(student -> "Студент: " + student.getName() + ", " + "балл: " + student.getGrade())
                .forEach(System.out::println);


    }

}
