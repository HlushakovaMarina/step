package L13_02_2025.L13_02_2025_ZOO2;


public class Lion extends WildAnimal {

    private static String species = "Лев";

    public Lion(String name, int age, String habitat) {
        super(name, species, age, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " рычит: Ррррр!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " быстро бежит по саванне.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест мясо.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит.");
    }

    @Override
    public void hunt() {
        super.hunt();
    }
}


