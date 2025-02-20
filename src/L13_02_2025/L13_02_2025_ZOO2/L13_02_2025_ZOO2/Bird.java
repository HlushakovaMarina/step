package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;

public class Bird extends Pet {
    private static String species = "Птица";
    public Bird(String name, int age) {
                super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " чирикает: Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюет зерна.");
    }

    @Override
    public void sleep() {

    }
}
