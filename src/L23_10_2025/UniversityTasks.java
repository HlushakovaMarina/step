package L23_10_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniversityTasks {

    //Задача 1: Найти всех студентов с заданным именем
    public static List<Student> findStudentsByName(University uni, String name) {
    return uni.getGroups().stream().flatMap(g->g.getStudents().stream())
            .filter(student -> student.getName().equals(name)).collect(Collectors.toList());
    }

//Задача 2: Найти все группы с заданным названием
public static List<Group> findGroupsByName(University uni, String name) {
    return uni.getGroups().stream()
            .filter(g->g.getGroupId().equals(name)).toList();
}
    //Задача 3: Найти все занятия по предмету
    public static List<Lesson> findLessonsBySubject(University uni, String subject) {
        return uni.getGroups().stream().flatMap(g->g.getLessons().stream())
                .filter(lesson ->lesson.getSubject().equals(subject)).toList();
    }
    //Задача 4: Найти студентов, у которых есть хотя бы одна оценка
    public static List<Student> findStudentsWithGrades(University uni) {
        return uni.getGrades().stream()
                .map(GradeRecord::getStudent).toList();
            }

// Задача 5: Найти группы, в которых есть хотя бы одно занятие
public static List<Group> findGroupsWithLessons(University uni) {
    return uni.getGroups().stream().filter(group -> !group.getLessons().isEmpty()).toList();
}
// Задача 6: Найти всех студентов, посещающих заданное занятие
public static List<Student> findAttendeesOfLesson(University uni, String lessonId) {
    return uni.getGroups().stream()
            .flatMap(group -> group.getLessons().stream())
            .filter(lesson -> lesson.getLessonId().equals(lessonId))
            .flatMap(lesson -> lesson.getAttendees().stream()).toList();
}

//  Задача 7: Найти все предметы, по которым есть оценки
public static Set<String> findSubjectsWithGrades(University uni) {
    return uni.getGrades().stream()
            .map(GradeRecord::getSubject)
            .collect(Collectors.toSet());
}

    //Задача 8: Найти количество студентов в университете
     public static long countTotalStudents(University uni) {
        return uni.getGroups().stream()
                .flatMap(group -> group.getStudents().stream()).count();
    }

    //Задача 9: Найти все занятия заданного типа (например, только лекции)
    public static List<Lesson> findLessonsByTypeSimple(University uni, LessonType type) {
        return uni.getGroups().stream()
                .flatMap(group -> group.getLessons().stream())
                .filter(lesson -> lesson.getType().equals(type)).toList();
    }

    //Задача 10: Найти студентов, у которых нет ни одной оценки
    public static List<Student> findStudentsWithoutGrades(University uni) {
        List<Student> studentsWithGrades = uni.getGrades().stream()
                .map(gradeRecord -> gradeRecord.getStudent()).toList();
        return uni.getGroups().stream().flatMap(group -> group.getStudents().stream()).filter(student -> !studentsWithGrades.contains(student)).toList();
    }
    //Задача 11: Найти всех студентов определённого курса
    public static List<Student> findStudentsByYear(University uni, int year) {
        return uni.getGroups().stream()
                .map(group -> group.getStudents()).filter(students -> students.).toList();
    }
}
