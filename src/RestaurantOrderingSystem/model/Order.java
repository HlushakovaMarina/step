package RestaurantOrderingSystem.model;

import java.util.List;

public class Order {
    private final int id;
    private final Customer customer;
    private final List<MenuItem> items;
    private Status status;
    private double totalAmount;

    public Order(int id, Customer customer, List<MenuItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.status = Status.CREATED;
        this.totalAmount = calculateTotal();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }


}
