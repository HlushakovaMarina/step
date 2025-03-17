package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportAnalyzer {
    private final List<Transport> transportsAnalyzer = new ArrayList<>();

    public void addTransport(Transport transport) {
        transportsAnalyzer.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filterByYear = new ArrayList<>();
        for (Transport transport : transportsAnalyzer) {
            if (transport.getYear() <= year) {
                filterByYear.add(transport);
            }
        }
        return filterByYear;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> findTop3Fastest = new ArrayList<>();
        int size = transportsAnalyzer.size();
        transportsAnalyzer.sort(new TransportSpeedComparator());
        if (size >= 3) {
            findTop3Fastest.add(transportsAnalyzer.get(size - 1));
            findTop3Fastest.add(transportsAnalyzer.get(size - 2));
            findTop3Fastest.add(transportsAnalyzer.get(size - 3));
        }
        return findTop3Fastest;
    }

    public Set<String> getUniqueBrands() {
        Set<String> getUniqueBrands = new HashSet<>();
        for (Transport transport : transportsAnalyzer) {
        getUniqueBrands.add(transport.getModel());
    }
        return getUniqueBrands;
}
    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> grouped = new HashMap<>();
        grouped.put("Медленный", new ArrayList<>());
        grouped.put("Средний", new ArrayList<>());
        grouped.put("Быстрый", new ArrayList<>());

        for (Transport transport : transportsAnalyzer) {
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
