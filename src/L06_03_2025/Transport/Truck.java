package L06_03_2025.Transport;

public class Truck extends Transport {
    private final int loadCapacity;

    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик {" +
                "Модель = '" + getModel() + '\'' +
                ", скорость = " + getSpeed() +
                ", грузоподьемность = " + loadCapacity +
                '}';
    }
}
