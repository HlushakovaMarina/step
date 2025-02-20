package L06_02_2025;

public class Smartphone extends ElectronicDevice {
    public int cameraResolution;

    public Smartphone(String brand, String model, int power, int cameraResolution) {
        super(brand, model, power);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + cameraResolution;
    }

    @Override
    public String getStatus() {
        super.getStatus();
        return "выключено";

    }
}
