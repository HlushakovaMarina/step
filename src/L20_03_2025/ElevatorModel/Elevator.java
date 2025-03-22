package L20_03_2025.ElevatorModel;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private final int maxCapacity;
    private final Queue<String> queue = new LinkedList<>();

    public Elevator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void enter(String person) {
        if (!isFull()) {
            queue.offer(person);
            System.out.println(person + " зашел(а) в лифт.");
        } else {
            System.out.println(person + " не может войти, лифт переполнен.");
        }
    }

    public String exit() {
        if (!queue.isEmpty()) {
            String person = queue.poll();
            System.out.println(person + " вышел(а) из лифта.");
            return person;
        } else {
            System.out.println("Лифт пуст, выходить некому.");
            return null;
        }
    }

    public int getCurrentPassengers() {
        return queue.size();
    }

    public String peekNextToExit() {
        if (!queue.isEmpty()) {
            String nextPerson = queue.peek();
            System.out.println("Следующий выйдет: " + nextPerson);
            return nextPerson;
        } else {
            System.out.println("Лифт пуст.");
            return null;
        }
    }

    public boolean isFull() {
        return queue.size() == maxCapacity;
    }
}