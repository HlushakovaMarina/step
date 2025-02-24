package L13_02_2025.L13_02_2025_ZOO2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Owner {

    private int id;

    private String name;

    private String surName;

    private String sex;

    private String firstName;

    private String lastName;

    private List<Pet> pets = new ArrayList<>();

    private static String[] names = new String[5];

    private static String[] surNames = new String[5];

    private static int totalOwners = 0;

    private static int nextId = 1; // Для генерации уникальных id

    private Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");
        names[0] = "Иван";
        names[1] = "Петр";
        names[2] = "Сергей";
        names[3] = "Анна";
        names[4] = "Мария";

        surNames[0] = "Иванов";
        surNames[1] = "Петров";
        surNames[2] = "Сидоров";
        surNames[3] = "Смирнова";
        surNames[4] = "Кузнецова";
    }

    public Owner(String firstName, String lastName) {
        this.id = nextId++;
        totalOwners++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = random.nextBoolean() ? "Male" : "Female";

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
        pet.setOwner(this);
    }

    public String toString() {
        return "Owner{" +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", sex='" + sex +
                ", petCount=" + pets.size() +
                '}';
    }

}