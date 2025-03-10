package L06_03_2025;

import L03_03_2025.students.FactoryStudents;
import L03_03_2025.students.Student;
import L03_03_2025.students.StudentNameComparator;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Set<Student> studentsLinked = new LinkedHashSet<>();
        Set<Student> studentsTreeSet = new TreeSet<>(new StudentNameComparator());
        for (int i = 0; i < 10; i++) {
            Student next = FactoryStudents.next();
            System.out.println(next);
            students.add(next);
            studentsLinked.add(next);
            studentsTreeSet.add(next);
        }


        System.out.println(students);
        System.out.println(students.size());
        System.out.println("------------");
        System.out.println(studentsLinked);
        System.out.println(studentsLinked.size());
        System.out.println("------------");
        System.out.println(studentsTreeSet);
        System.out.println(studentsTreeSet.size());
    }
}