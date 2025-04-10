package L10_04_2025;

public class Task00 {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample);
        System.out.println(singletonExample2);
        Student student = new Student.Builder("Дима")
                .age(35)
                .email("mail@mail.com")
                .build();

        StudentService studentService = new StudentServiceimpl();
        StudentService studentServiceLogging = new LoggingStudentServiceDecorator(studentService);
        studentServiceLogging .enroll("Дима");
        studentServiceLogging .printAll();
        test(studentService);
        test(studentServiceLogging);
    }
private static void test(StudentService studentService){
        studentService.printAll();
}
}
