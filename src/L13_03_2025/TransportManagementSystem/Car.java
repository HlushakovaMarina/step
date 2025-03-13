package L13_03_2025.TransportManagementSystem;

public class Car extends Transport {
    private final String fuelType;

    public Car(String model, int speed, String licensePlate, int year, User user, String fuelType) {
        super(model, speed, licensePlate, year, user);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                '}' + super.toString();
    }
}