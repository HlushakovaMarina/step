package L13_03_2025.TransportManagementSystem;

public class Truck extends Transport {
        private final int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int year, User user, int loadCapacity) {
        super(model, speed, licensePlate, year, user);
        this.loadCapacity = loadCapacity;
    }

    @Override
        public String toString() {
            return "Truck{" + "loadCapacity=" + loadCapacity + '}' + super.toString();
        }
    }



