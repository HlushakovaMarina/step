package L06_03_2025.Transport;

public class Bike extends Transport{
    private String hasSidecar;

    public Bike(String model, int speed, String hasSidecar) {
        super(model, speed);
        this.hasSidecar = hasSidecar;
    }
}
