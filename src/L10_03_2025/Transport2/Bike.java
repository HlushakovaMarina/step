package L10_03_2025.Transport2;

public class Bike extends Transport {
    private final boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
