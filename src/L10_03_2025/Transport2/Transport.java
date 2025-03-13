package L10_03_2025.Transport2;

import java.util.Objects;

public abstract class Transport {
    private final String model;
    private final int speed;
    private final String licensePlate;

    public Transport(String model, int speed, String licensePlate) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

