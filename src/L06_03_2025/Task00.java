package L06_03_2025;

import L03_03_2025.students.FactoryStudents;
import L03_03_2025.students.User;
import L03_03_2025.students.StudentNameComparator;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Set<User> students = new HashSet<>();
        Set<User> studentsLinked = new LinkedHashSet<>();
        Set<User> studentsTreeSet = new TreeSet<>(new StudentNameComparator());
        for (int i = 0; i < 10; i++) {
            User next = FactoryStudents.next();
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