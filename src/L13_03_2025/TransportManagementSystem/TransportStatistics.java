package L13_03_2025.TransportManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private final Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        String brand = transport.getModel();
        brandCount.put(brand, brandCount.getOrDefault(brand, 0) + 1);
    }
    public int getBrandCount(String brand) {
        return brandCount.getOrDefault(brand, 0);
    }
    public void printBrandStatistics() {
        brandCount.forEach((brand, count) -> System.out.println(brand + ": " + count));
    }
}
