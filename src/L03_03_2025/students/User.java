package L03_03_2025.students;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private double grade;

    public User(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User student = (User) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return name + " " + age + " Средний балл: " + grade;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}