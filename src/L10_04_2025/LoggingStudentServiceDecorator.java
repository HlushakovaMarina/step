package L10_04_2025;

public class LoggingStudentServiceDecorator implements StudentService{
    private final StudentService delegate;

    public LoggingStudentServiceDecorator(StudentService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void enroll(String name) {
        System.out.println("[LOG] Вызов метода enroll");
        delegate.enroll(name);
        System.out.println("[LOG] Окончание метода enroll");
    }

    @Override
    public void printAll() {
        System.out.println("[LOG] вызов метода printAll");
        delegate.printAll();
    }
}
