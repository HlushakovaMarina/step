package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;


public abstract class Pet extends Animal {
    private int id;
    private String name;
    private String type;
    private int age;
    private Owner owner;
    private static int nextId = 1; // Для генерации уникальных id

    public Pet(String name, String type, int age) {
        super(name,type,age);
        this.id = nextId++;
        this.name = name;
        this.type = type;
        this.age = age;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        if (owner != null) {
            return owner.getName() + " " + owner.getSurName();
        } else {
            return "Без владельца";
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name  +
        ", type='" + type +
        ", age=" + age +
                ", owner=" + getOwnerName() +
                '}';
    }

    public void makeSound() {

    }

    public void move() {

    }

    public void eat() {

    }

    public void sleep() {

    }
}