package L06_03_2025.Transport;

import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static final Random transport = new Random();
    private static List<String> models = List.of("BMW", "Honda", "Susuki", "GMS", "Kavasaki");
    private static final String[] carFuelTypes = {"Бензин", "Дизель", "Электрический"};


    public static Transport next() {
        int i = transport.nextInt(3);
        String model = models.get(transport.nextInt(models.size())) + "_" + transport.nextInt(100);
        int speed = transport.nextInt(250);


        switch (i) {
            case 0:
                String fuelType = carFuelTypes[transport.nextInt(carFuelTypes.length)];
                return new Car(model, speed, fuelType);
            case 1:
                boolean hasSidecar = transport.nextBoolean();
                return new Bike(model, speed, hasSidecar);
            case 2:
                int loadCapacity = transport.nextInt(10000) + 1000;
                return new Truck(model, speed, loadCapacity);
            default:
                return new Transport(model, speed);
        }

    }
}

