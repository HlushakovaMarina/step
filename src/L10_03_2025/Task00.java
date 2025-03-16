package L10_03_2025;

import L03_03_2025.students.User;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        User student1 = new User("Dima", 22, 7);
        User student2 = new User("Anna", 25, 8);
        User student3 = new User("Katya", 25, 4);
        Map<Integer, User> mapAgeToStudent = new HashMap<>();

        mapAgeToStudent.put(student1.getAge(), student1);
        mapAgeToStudent.put(student2.getAge(), student2);
        mapAgeToStudent.putIfAbsent(student3.getAge(), student3);
        System.out.println(mapAgeToStudent);
        User student = mapAgeToStudent.get(22);
        boolean containsStudents2 = mapAgeToStudent.containsValue(student2);
        Set<Integer> ages=mapAgeToStudent.keySet();

        for (Map.Entry<Integer, User> entry:mapAgeToStudent.entrySet()){
           User value =entry.getValue();
           Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }
        mapAgeToStudent.getOrDefault(90,new User("wow", 12,2));
        mapAgeToStudent.remove(34);
        Map<Integer, List<User>> ageStudentMap = new HashMap<>();
//        List<Student>students=new ArrayList<>();
//        students.add(student1);
//        ageStudentMap.put(student1.getAge(),students);
//        List<Student>students1=ageStudentMap.get(student1.getAge());
//        students1.add(student2);

        List<User> studentList = List.of(student1,student2,student3);
        for (User s :studentList){
            ageStudentMap.putIfAbsent(s.getAge(),new ArrayList<>());
            List<User>list = ageStudentMap.get(s.getAge());
            list.add(s);
        }
        System.out.println(ageStudentMap);

    }
}
