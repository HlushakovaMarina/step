package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportUserManager {
    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();


    public void addTransport(Transport transport) {
        User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        transportByOwner.get(user).add(transport);
//        List<Transport>transports=transportByType.get(type);
//        transports.add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        transportByOwner.remove(licensePlate);
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            List<Transport> value = entry.getValue();
            Iterator<Transport> iterator = value.iterator();
            while (iterator.hasNext()) ;
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
            }
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transports = transportByOwner.get(owner);
        transports.sort(Comparator.comparingInt(Transport::getSpeed));
        return transports.getLast();
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> treeMap = new H
        return transportByOwner.get();
    }


    public void printAllOwnersAndTransport() {
        transportByOwner.values().forEach(System.out::println);
    }

}


