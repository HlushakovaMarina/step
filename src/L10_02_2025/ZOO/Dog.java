package L10_02_2025.ZOO;

public class Dog extends Pet {

    public Dog(String name, String species, int age, String ownersName) {
        super(name, species, age, ownersName);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает на четырех лапах.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест собачий корм.");
    }

    @Override
    public void sleep() {

    }
}

