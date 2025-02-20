package L10_02_2025;



public class Television extends ElectronicDevice {
    public int screenSize;

    public Television(String brand, String model, int power, int screenSize) {
        super(brand, model, power);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + screenSize;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public String getStatus() {
        super.getStatus();
        return "включено";
    }
}
