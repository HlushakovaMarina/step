package L20_03_2025.BusStop;

public class Main {
    public static void main(String[] args) {
        BusStop busStop = new BusStop();

        busStop.addPassenger("Андрей");
        busStop.addPassenger("Сергей");
        busStop.addPassenger("Марина");
        busStop.peekNextPassenger();
        busStop.boardBus();
        System.out.println(busStop.getQueueSize() + " человек(а) осталось в очереди.");
        busStop.boardBus();
        busStop.boardBus();
        busStop.peekNextPassenger();



    }
}
