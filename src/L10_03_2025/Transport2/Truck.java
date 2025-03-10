package L10_03_2025.Transport2;

import L06_03_2025.Transport.Transport;

public class Truck extends Transport {
    private final int loadCapacity;

    public Truck(String model, int speed, String randomLicensePlate,int loadCapacity) {
        super(model, speed,randomLicensePlate);
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
