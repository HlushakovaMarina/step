package L06_03_2025.Transport;

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
    }
}
