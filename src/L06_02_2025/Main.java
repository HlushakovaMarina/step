package L06_02_2025;

public class Main {
    public static void Main(String[] args) {
        Laptop laptop = new Laptop("Samsung", "nz850", 220, 3000);
        System.out.println(laptop.toString());
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOn();
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOff();
        System.out.println("Состояние: " + laptop.getStatus());

        Smartphone smartphone = new Smartphone("Apple", "kwv555", 200, 48);
        System.out.println(smartphone.toString());
        System.out.println("Состояние: " + smartphone.getStatus());
        smartphone.turnOn();
        System.out.println("Состояние: " + smartphone.getStatus());
        smartphone.turnOff();
        System.out.println("Состояние: " + smartphone.getStatus());

        Television television = new Television("", "a25", 300, 80);
        System.out.println(television.toString());
        System.out.println("Состояние: " + television.getStatus());
        television.turnOn();
        System.out.println("Состояние: " + television.getStatus());
        television.turnOff();
        System.out.println("Состояние: " + television.getStatus());
    }

}
