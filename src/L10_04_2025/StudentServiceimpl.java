package L10_04_2025;

public class StudentServiceimpl implements StudentService {
    @Override
    public void enroll(String name) {
        System.out.println("Добавлен студент " + name);
    }

    @Override
    public void printAll() {
        System.out.println("Список всех студентов ... ");
    }
}
