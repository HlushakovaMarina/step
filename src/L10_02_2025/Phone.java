package L10_02_2025;


public class Phone {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple", "kwv555", 200, 48);
        Laptop laptop1 = new Laptop("Samsung", "nz850", 220, 3000);
        Television television1 = new Television("", "a25", 300, 80);
        ElectronicDevice[] electronicDevice = {smartphone1, laptop1, television1};

        for (ElectronicDevice device : electronicDevice) {
            System.out.println(device);
            System.out.println("Состояние: " + device);
            smartphone1.turnOn();
            System.out.println("Состояние: " + device);
            smartphone1.turnOff();
            System.out.println(device);
            System.out.println();
        }
    }
}