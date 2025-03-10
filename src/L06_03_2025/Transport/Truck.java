package L06_03_2025.Transport;

public class Truck extends Transport{

    private long loadCapacity;

    public Truck(String model, int speed, long loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }
}
