package L06_02_2025;

public class ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    private boolean isOn;


    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        boolean isOn = true;
        System.out.println(model + " от " + brand + " включен.");

    }

    public void turnOff() {
        boolean isOn = false;
        System.out.println(model + " от " + brand + " выключен.");
    }

    @Override
    public String toString() {
        return "Устройство:" + brand + " " + model + ", мощность:" + power + " Вт";
    }

    public String getStatus() {

        if (isOn){

            return "включено";
        }
        else
        {
           return "выключено";
        }

    }
}