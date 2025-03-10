package L06_03_2025.Transport;

import java.util.*;

public class TransportManager {
    List<Transport> transportList = new ArrayList<>();
    Set<Transport> uniqueTransportSet = new HashSet<>();


    public void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    public void removeTransport(String model) {
        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
        System.out.println();
    }

    public void sortTransportBySpeed() {
        transportList.sort(Comparator.comparingInt(Transport::getSpeed));
        Set<Transport> sortedSet = new TreeSet<>(Comparator.comparingInt(Transport::getSpeed));
        sortedSet.addAll(uniqueTransportSet);
        uniqueTransportSet = sortedSet;
        System.out.println();
    }

    public void sortTransportByModel() {
        transportList.sort(Comparator.comparing(Transport::getModel));
        Set<Transport> sortedSet = new TreeSet<>(Comparator.comparing(Transport::getModel));
        sortedSet.addAll(uniqueTransportSet);
        uniqueTransportSet = sortedSet;
        System.out.println();
    }

    public void printAllTransport() {
        System.out.println("Весь транспорт:");
        for (Transport transport : transportList) {
            System.out.println(transport);
        }
        System.out.println();
    }

    public void printUniqueTransport() {
        System.out.println("Уникальный транспорт:");
        for (Transport transport : uniqueTransportSet) {
            System.out.println(transport);
        }
    }
}
