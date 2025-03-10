package L06_03_2025.Transport;

public class Bike extends Transport {
    private final boolean hasSidecar;

    public Bike(String model, int speed, boolean hasSidecar) {
        super(model, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл {" +
                "Модель ='" + getModel() + '\'' +
                ", скорость = " + getSpeed() +
                ", коляска = " + hasSidecar +
                '}';
    }
}
