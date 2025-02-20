package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;

public  class Cat extends Pet {
private static String species = "Кот";
    public Cat(String name, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " грациозно крадется.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит.");
    }
}
