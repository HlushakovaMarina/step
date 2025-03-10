package L03_03_2025.students;

import java.util.ArrayList;
import java.util.List;

public class Main extends FactoryStudents {
    public static void main(String[] args) {
        // Создание 100 студентов с рандомными значениями и помещение их в List
        List<Student> students = new ArrayList<>(100);

        // Пример использования методов
        String searchName = "Студент1";
        Student foundStudent = findStudentByName(students, searchName);
        if (foundStudent != null) {
            System.out.println("Найден студент: " + foundStudent);
        } else {
            System.out.println("Студент с именем " + searchName + " не найден.");
        }

        String deleteName = "Студент2";
        removeStudentByName(students, deleteName);
        System.out.println("Студент с именем " + deleteName + " удален.  Размер списка: " + students.size());

        List<Student> moreStudents = new ArrayList(5); //Создаем еще список студентов для добавления
        addStudentsToList(students, moreStudents);
        System.out.println("Добавлены студенты. Размер списка: " + students.size());

        int replaceIndex = 1;
        Student newStudent = new Student("Заменен студент", 22, 4.9);
        replaceStudentAtIndex(students, replaceIndex, newStudent);
        System.out.println("Студент в индексе " + replaceIndex + " заменен: " + students.get(replaceIndex));
    }


    public static Student findStudentByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void removeStudentByName(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public static void addStudentsToList(List<Student> firstList, List<Student> nextList) {
        firstList.addAll(nextList);

    }

    public static void replaceStudentAtIndex(List<Student> students, int index, Student newStudent) {
        if (index >= 0 && index < students.size()) {
            students.set(index, newStudent);
        } else {
            System.out.println("Неподобающий индекс для замены.");
        }
    }
}
