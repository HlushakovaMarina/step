package RestaurantOrderingSystem.model;

import RestaurantOrderingSystem.Enum.Status;

import java.util.List;

public class Order {
    private final Long id;
    private final Customer customer;
    private final List<MenuItem> items;
    private Status status;
    private double totalAmount;

    public Order(Long id, Customer customer, List<MenuItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.status = Status.CREATED;
        this.totalAmount = calculateTotal();
    }

    public Long getId() {
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

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Заказ ID: ").append(id).append("\n");
        sb.append("Покупатель: ").append(customer.getName()).append("\n");
        sb.append("Блюдо:\n");
        for (MenuItem item : items) {
            sb.append("\t").append(item).append("\n");
        }
        sb.append("Общий итог: ").append(getTotalAmount()).append("\n");
        sb.append("Статус: ").append(status).append("\n");
        return sb.toString();
    }
}
