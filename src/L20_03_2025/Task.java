package L20_03_2025;

import java.util.Comparator;

public class Task implements Comparable<Task> {
    private int priority;
    private String title;

    public Task(int priority, String title) {
        this.priority = priority;
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority,o.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", title='" + title + '\'' +
                '}';
    }
}
