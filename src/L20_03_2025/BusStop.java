package L20_03_2025;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;

public class BusStop {


    private final Queue<String> queue = new LinkedList<>();

    public void addPassenger(String name) {
        queue.add(name);
        System.out.println(name + "Встал(а) в очередь на автобус.");
    }

    public String boardBus() {
        if (queue.isEmpty()) {
            return "Очередь пустая";
        }
        String passanger = queue.poll();

        return "Следующий пассажир: " + passanger;

    }

    public int getQueueSize() {
        int size = queue.size();
        return queue.size();
    }

    String peekNextPassenger() {
        return queue.peek();
    }
}
