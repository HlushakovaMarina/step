package L10_02_2025;



public class Laptop extends ElectronicDevice {
    public int timeBattery;

    public Laptop(String brand, String model, int power, int timeBattery) {
        super(brand, model, power);
        this.timeBattery = timeBattery;
    }

    @Override
    public String toString() {
        return super.toString() + timeBattery;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public String getStatus() {
        return isOn ? "Смартфон включен" : "Сьартфон выключен";
    }
}
