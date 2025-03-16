package L13_03_2025.TransportManagementSystem;

public class Bike extends Transport {
    private final boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, int year, User user, boolean hasSidecar) {
        super(model, speed, licensePlate, year, user);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
