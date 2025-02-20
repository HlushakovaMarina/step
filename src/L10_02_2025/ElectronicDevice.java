package L10_02_2025;

public abstract class ElectronicDevice {
    protected String brand;
    protected String model;
    protected int power;
    protected boolean isOn = false;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getStatus() {
        return null;
    }


    @Override
    public String toString() {
        return "Устройство: " + brand + " " + model + ", мощность: " + power + " Вт";
    }

}
