package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportAnalyzer {
    private List<Transport> transports;
    public TransportAnalyzer(List<Transport> transports) {
        this.transports = transports;
    }

    public List<Transport> filterByYear(int year) {
        return transports.

    }

    public List<Transport> findTop3Fastest() {
        return transports.
    }
    public Set<String> getUniqueBrands() {
        return transports.


    }

    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> grouped = new HashMap<>();
        grouped.put("Медленный", new ArrayList<>());
        grouped.put("Средний", new ArrayList<>());
        grouped.put("Быстрый", new ArrayList<>());

        for (Transport transport : transports) {
            int speed = transport.getSpeed();
            if (speed < 100) {
                grouped.get("Медленный").add(transport);
            } else if (speed <= 200) {
                grouped.get("Средний").add(transport);
            } else if (speed > 201){
                grouped.get("Быстрый").add(transport);
            }
        }
        return grouped;
    }
}
