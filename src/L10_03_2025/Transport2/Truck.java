package L10_03_2025.Transport2;

    public class Truck extends Transport {
        private final int loadCapacity;

        public Truck(String model, int speed, String licensePlate, int loadCapacity) {
            super(model, speed, licensePlate);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public String toString() {
            return "Truck{" + "loadCapacity=" + loadCapacity + '}' + super.toString();
        }
    }



