package L20_03_2025.BusStop;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {


    private final Queue<String> queue = new LinkedList<>();

    public void addPassenger(String name) {
        queue.add(name);
        System.out.println(name + " встал(а) в очередь на автобус.");
    }

    public String boardBus() {
        String passenger = queue.poll();
        if (passenger != null) {
            System.out.println(passenger + " сел(а) в автобус.");
        } else {
            System.out.println("Автобус пустой, никто не ждет.");
        }
        return passenger;
    }

    public int getQueueSize() {
        int size = queue.size();
        return queue.size();
    }

    public String peekNextPassenger() {
        String nextPassenger = queue.peek();
        if (nextPassenger != null) {
            System.out.println("Следующий пассажир: " + nextPassenger);
        } else {
            System.out.println("Очередь пуста, автобус уезжает пустым.");
        }
        return nextPassenger;
    }
}
