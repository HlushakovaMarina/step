package L31_03_2025.RandomPicker;

import java.util.Objects;

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

    public boolean getPassportId() {
        return passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(passportId, that.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passportId);
    }
}


