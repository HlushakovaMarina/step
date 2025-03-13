package L13_03_2025.TransportManagementSystem;


import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private final String model;
    private final int speed;
    private final String licensePlate;
    private int year;
    private User user;

    public Transport(String model, int speed, String licensePlate) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public Transport(String model, int speed, String licensePlate, int year, User user) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
        this.user = user;
    }

    public Transport(int year, String licensePlate, int speed, String model) {
        this.year = year;
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
                "year=" + year +
                ", licensePlate='" + licensePlate + '\'' +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}

