package L27_03_2025.RandomPicker;

public class Participant {
    private final String name;
    private final int age;
    private final Sex sex;
    private final String passportId;

    public Participant(String name, int age, Sex sex, String passportId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getPassportId() {
        return passportId;
    }
}

