package L13_02_2025;

public  class Cat extends Pet {

    public Cat(String name, String species, int age, String ownersName) {
        super(name, species, age, ownersName);
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
