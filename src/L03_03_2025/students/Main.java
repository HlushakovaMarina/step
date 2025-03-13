package L03_03_2025.students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<User> students = new ArrayList<>();
    private static List<User> foundStudents = new ArrayList<>();
    private static User studentChange = new User("Виктор", 28, 75);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            students.add(FactoryStudents.next());
        }
        // Поиск студента
        foundStudent("Дима");
        System.out.println(foundStudents);

        // Удаление студента
        deleteStudent("Дима");
        System.out.println(students);

        //Добавление студента
        addStudent(foundStudents);
        System.out.println(students);

        // Замена студента по индексу
        changeStudent(0);
        System.out.println(students);
    }

    // метод нахождения студента по имени
    static List foundStudent(String name) {
        for (User student : students) {
            if (name.equals(student.getName())) {
                foundStudents.add(student);
                break;
            }
        }
        return foundStudents;
    }

    // метод удаления студента по имени
    static List deleteStudent(String name) {
        for (User student : students) {
            if (name.equals(student.getName())) {
                students.remove(name);
            }
        }
        return students;
    }

    // метод добавления List студентов к другому List студентов
    static List addStudent(List List) {
        students.addAll(List);
        return students;
    }

    // метод замены студента по индексу
    static List changeStudent(int index) {
        students.set(index, studentChange);
        return students;
    }
}