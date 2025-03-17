package L13_03_2025.TransportManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private final Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        String brand = transport.getModel();
        if (brandCount.containsKey(brand)){
            int count = brandCount.get(brand);
            brandCount.put(brand,++count);
        }
        else {
            brandCount.put(brand,1);
        }
    }
    public int getBrandCount(String brand) {
        return brandCount.get(brand);
    }
    public void printBrandStatistics() {
        brandCount.forEach((brand, count) -> System.out.println(brand + ": " + count));
    }
}
