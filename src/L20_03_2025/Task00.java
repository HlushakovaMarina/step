package L20_03_2025;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Dima");
        queue.offer("Sasha");
        queue.offer("Marina");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("");

        Queue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.offer(new Task(1, "Запустить сервер"));
        taskQueue.offer(new Task(3, "Проверить логи"));
        taskQueue.offer(new Task(2, "Обновить базу данных"));
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue);

        Deque<String>deque=new ArrayDeque<>();
        deque.offerFirst("Первый");
        deque.offerLast("Последний");
        deque.pollFirst();


    }
}
