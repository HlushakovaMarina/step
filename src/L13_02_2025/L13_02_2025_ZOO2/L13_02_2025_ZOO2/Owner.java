package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;


import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;
    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private Pet[] pets;
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

    public Owner() {
        this.id = nextId++;
        totalOwners++;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.pets = new Pet[0]; // Изначально пустой массив
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

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    public void addPet(Pet pet) {

        Pet[] newPets = new Pet[this.pets.length + 1];

        System.arraycopy(this.pets, 0, newPets, 0, this.pets.length);

        newPets[this.pets.length] = pet;

        this.pets = newPets;

        pet.setOwner(this);
    }

    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name +
        ", surName='" + surName +
        '}';
    }
}