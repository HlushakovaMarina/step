package L06_03_2025.Transport;

import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static final Random transport = new Random();
    private static List<String> model = List.of("BMW", "Honda", "Susuki", "GMS", "Kavasaki");

    public TransportFactory next() {
        int i = transport.nextInt(3);
                int model;
                int hasSidecar;
                long loadCapacity;

        if (i == 2) {
            return new Car(model[transport.nextInt(model.size())],transport.nextInt(20));
        } else if (i == 1) {
            return new Bike(model[transport.nextInt(model.size())], transport.nextInt(20));
        } else {
            return new Truck(model[transport.nextInt(model.size())], transport.nextInt(20));
        }
    }
}
}
