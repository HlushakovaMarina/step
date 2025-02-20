package L10_02_2025.ZOO;

public class Bird extends Pet {
    public Bird(String name, String species, int age, String ownersName) {
                super(name, species, age, ownersName);
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
