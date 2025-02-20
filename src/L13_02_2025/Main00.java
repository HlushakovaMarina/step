package L13_02_2025;

public class Main00 {
    public static void main(String[] args) {
        Animal dog = new Dog("Барсик", "Собака", 3, "");
        Animal cat = new Cat("Мурка", "Кот", 2, "Анна");
        Animal bird = new Bird("Кеша", "Птица", 1, "");
        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");
        Animal[] animals = {dog, cat, bird, lion};

        for (Animal animal : animals) {
            System.out.println();
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();
            animal.sleep();

            if (animal instanceof Pet) {
                ((Pet) animal).play();
            }

            if (animal instanceof WildAnimal) {
                ((WildAnimal) animal).hunt();

                System.out.println();

            }

        }

        System.out.println("Общее количество животных " +
                Animal.getTotalAnimals());
    }
}


