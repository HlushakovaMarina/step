package L06_03_2025.Transport;

public class Car extends Transport{
    private String fuelType;

    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

   }
