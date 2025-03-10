package L10_03_2025.Transport2;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();
        for (int i = 0; i < 20; i++) {
            manager.addTransport(TransportFactory.next());
        }

        System.out.println(" Начальное состояние ");
        manager.printAllTransport();
        manager.printUniqueTransport();

        System.out.println(" удаение первой модели ");
        manager.removeTransport("Модель №1");
        manager.printAllTransport();
        manager.printUniqueTransport();

        System.out.println(" Сортировка по скорости ");
        manager.sortTransportBySpeed();
        manager.printAllTransport();
        manager.printUniqueTransport();

        System.out.println(" Сортировка по модели ");
        manager.sortTransportByModel();
        manager.printAllTransport();
        manager.printUniqueTransport();
        test("Hi", "WOW");
        test("Hi");
        test();
        String[]s=new String[12];
        test(s);
    }

    public static void test(String... strings) {
        for (String string:strings);

    }
}
