package L13_03_2025.TransportManagementSystem;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TransportSpeedGrouper {
    private final Map<Integer, Set<Transport>> transportBySpeed = new TreeMap<>();

    public void addTransport(Transport transport) {
        transportBySpeed.computeIfAbsent(transport.getSpeed(),a -> new HashSet<>()).add(transport);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.getOrDefault(speed, new HashSet<>());
    }
}
