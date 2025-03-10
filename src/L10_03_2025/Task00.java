package L10_03_2025;

import L03_03_2025.students.FactoryStudents;
import L03_03_2025.students.Student;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 22, 7);
        Student student2 = new Student("Anna", 25, 8);
        Student student3 = new Student("Katya", 25, 4);
        Map<Integer, Student> mapAgeToStudent = new HashMap<>();

        mapAgeToStudent.put(student1.getAge(), student1);
        mapAgeToStudent.put(student2.getAge(), student2);
        mapAgeToStudent.putIfAbsent(student3.getAge(), student3);
        System.out.println(mapAgeToStudent);
        Student student = mapAgeToStudent.get(22);
        boolean containsStudents2 = mapAgeToStudent.containsValue(student2);
        Set<Integer> ages=mapAgeToStudent.keySet();

        for (Map.Entry<Integer,Student> entry:mapAgeToStudent.entrySet()){
           Student value =entry.getValue();
           Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }
        mapAgeToStudent.getOrDefault(90,new Student("wow", 12,2));
        mapAgeToStudent.remove(34);
        Map<Integer, List<Student>> ageStudentMap = new HashMap<>();
//        List<Student>students=new ArrayList<>();
//        students.add(student1);
//        ageStudentMap.put(student1.getAge(),students);
//        List<Student>students1=ageStudentMap.get(student1.getAge());
//        students1.add(student2);

        List<Student> studentList = List.of(student1,student2,student3);
        for (Student s :studentList){
            ageStudentMap.putIfAbsent(s.getAge(),new ArrayList<>());
            List<Student>list = ageStudentMap.get(s.getAge());
            list.add(s);
        }
        System.out.println(ageStudentMap);

    }
}
