package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportSpeedGrouper {
    private final Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    public void addTransport(Transport transport) {
        transportBySpeed.putIfAbsent(transport.getSpeed(),new TreeSet<>());
        transportBySpeed.get(transport.getSpeed()).add(transport);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.getOrDefault(speed, new HashSet<>());
    }
}
