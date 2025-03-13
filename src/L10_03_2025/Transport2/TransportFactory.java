package L10_03_2025.Transport2;

import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static final Random transport = new Random();
    private static List<String> models = List.of("BMW", "Honda", "Susuki", "GMS", "Kavasaki");
    private static List<String> carFuelTypes = List.of("Бензин", "Дизель", "Электрический");


    public static Transport next() {
        int i = transport.nextInt(3);
        String model = models.get(transport.nextInt(models.size())) + "_" + transport.nextInt(100);
        int speed = transport.nextInt(250);
        String randomLicensePlate = String.valueOf(transport.nextInt(1000, 9999));//рандомный номерной знак


        switch (i) {
            case 0:
                String fuelType = transport.nextBoolean() ? "Gasoline" : "Diesel";
                return new Car(model, speed, randomLicensePlate, fuelType);
            case 1:
                boolean hasSidecar = transport.nextBoolean();
                return new Bike(model, speed, randomLicensePlate, hasSidecar);
            case 2:
                int loadCapacity = transport.nextInt(1000) + 1000;
                return new Truck(model, speed, randomLicensePlate, loadCapacity);
            default:
                return null;
        }

    }
}

