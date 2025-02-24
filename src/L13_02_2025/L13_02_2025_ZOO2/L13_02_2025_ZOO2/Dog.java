package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;

public class Dog extends Pet {
private static String species = "Собака";
    public Dog(String name, int age) {
        super();
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

