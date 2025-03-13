package L10_03_2025.Transport2;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();
        for (int i = 0; i < 20; i++) {
            manager.addTransport(TransportFactory.next());
        }

        System.out.println("Все транспортные средства:");
        manager.printAllTransport();
        System.out.println();

        String licensePlateToFind = manager.transportByPlate.keySet().iterator().next();
        System.out.println("Транспортное средство по номеру " + licensePlateToFind + ":");
        System.out.println(manager.findTransportByPlate(licensePlateToFind));
        System.out.println();

        System.out.println("Список машин:");
        manager.getTransportByType("Car").forEach(System.out::println);
        System.out.println();

        System.out.println("Самая быстрая машина:");
        System.out.println(manager.getFastestTransportByType("Car"));
        System.out.println();

        String licensePlateToRemove = manager.transportByPlate.keySet().iterator().next();
        System.out.println("Удаляем транспортное средство с номером " + licensePlateToRemove);
        manager.removeTransport(licensePlateToRemove);
        System.out.println();

        System.out.println("Все транспортные средства после удаления:");
        manager.printAllTransport();


        Integer num14 = Integer.MAX_VALUE;
        Boolean aTrue = Boolean.TRUE;
        String t = Boolean.TRUE.toString();
        System.out.println(num14);

    }
}