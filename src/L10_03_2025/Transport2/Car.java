package L10_03_2025.Transport2;

public class Car extends Transport {
    private final String fuelType;

    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Машина {" +
                "Модель = '" + getModel() + '\'' +
                ", скорость = " + getSpeed() +
                ", тип топлива ='" + fuelType + '\'' +
                '}';
    }
}