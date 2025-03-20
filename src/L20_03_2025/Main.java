package L20_03_2025;

public class Main {
    public static void main(String[] args) {
        BusStop busStop =new BusStop();

        busStop.addPassenger("Андрей");
        busStop.addPassenger("Сергей");
        busStop.addPassenger("Марина");
        busStop.boardBus();
        busStop.getQueueSize();
    }
}
