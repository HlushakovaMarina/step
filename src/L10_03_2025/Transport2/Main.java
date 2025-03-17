package L10_03_2025.Transport2;

import L13_03_2025.TransportManagementSystem.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;

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

        System.out.println("Список машин: ");
        manager.getTransportByType("Car").forEach(System.out::println);
        System.out.println();

        System.out.println("Самая быстрая машина: ");
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


        User user1 = new User("Саша");
        User user2 = new User("Анна");


        Transport car1 = new Transport("BMW X5", 250, "BD 9876-2", user1, 2020);
        Transport car2 = new Transport("Toyota Camry", 180, "AH 6975-3", user1, 2018);
        Transport car3 = new Transport("Mercedes-Benz C-Class", 220, "JH 3257-1", user2, 2022);
        Transport car4 = new Transport("Lada Granta", 160, "LI 1238-7", user2, 2015);


        TransportUserManager userManager = new TransportUserManager();
        userManager.addTransport(user1, car1);
        userManager.addTransport(user1, car2);
        userManager.addTransport(user2, car3);
        userManager.addTransport(user2, car4);

        System.out.println("Транспорт Саши:");
        userManager.getTransportByOwner(user1).forEach(System.out::println);


        TransportStatistics statistics = new TransportStatistics();
        statistics.addTransport(car1);
        statistics.addTransport(car2);
        statistics.addTransport(car3);
        statistics.addTransport(car4);

        System.out.println("Статистика по брендам:");
        statistics.printBrandStatistics();

        TransportSpeedGrouper speedGrouper = new TransportSpeedGrouper();
        speedGrouper.addTransport(car1);
        speedGrouper.addTransport(car2);
        speedGrouper.addTransport(car3);
        speedGrouper.addTransport(car4);

        System.out.println("Транспорт со скоростью 180:");
        speedGrouper.getTransportBySpeed(180).forEach(System.out::println);

        List<Transport> allTransports = new ArrayList<>();
        allTransports.add(car1);
        allTransports.add(car2);
        allTransports.add(car3);
        allTransports.add(car4);
    }
     for (int i = 0; i < 96; i++) {

    }

}