package L27_03_2025.RandomPicker;

import java.util.*;

public class LotteryMachine<T> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new ArrayDeque<>();
    private List<T> winners = new ArrayList<>();
    private boolean initialized;

    public List<T> getAllItems() {
        return allItems;
    }

    public void setAllItems(List<T> allItems) {
        this.allItems = allItems;
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public void setQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public void add(T item) {
        if (!initialized) {
            allItems.add(item);
        }
    }

    public void init() {
        if (!initialized) {
            Collections.shuffle(allItems);
            queue.addAll(allItems);
            initialized = true;
        }
    }

    public T pick() {
        if (!initialized) {
            init();
        }
//        return queue.poll(); задача 1
        T winner = queue.poll();
        winners.add(winner);
        return ;
    }

    public void reset() {
            Collections.shuffle(allItems);
            queue.clear();
            queue.addAll(allItems);
        }

    public int remaining() {
        return queue.size();
    }
}




