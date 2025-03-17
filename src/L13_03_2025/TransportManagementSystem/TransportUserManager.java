package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportUserManager {
    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();


    public void addTransport(Transport transport) {
        final User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        transportByOwner.get(user).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        Iterator<Transport> iterator = transports.iterator();
        while (iterator.hasNext()) ;
        Transport next = iterator.next();
        if (licensePlate.equals(next.getLicensePlate())) {
            iterator.remove();
        }
    }


    public Transport getFastestTransport(User owner) {
        List<Transport> transports = transportByOwner.get(owner);
        transports.sort(Comparator.comparingInt(Transport::getSpeed));
        return transports.getLast();
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> findOwnerWithMostCars = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            int size = entry.getValue().size();
            User value = entry.getKey();
            findOwnerWithMostCars.put(size, value);
        }
        return findOwnerWithMostCars.lastEntry().getValue();
    }


    public void printAllOwnersAndTransport() {
        transportByOwner.values().forEach(System.out::println);
    }
}


