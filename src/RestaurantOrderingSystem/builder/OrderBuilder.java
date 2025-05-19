package RestaurantOrderingSystem.builder;

import RestaurantOrderingSystem.model.Customer;
import RestaurantOrderingSystem.model.MenuItem;
import RestaurantOrderingSystem.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private int id;
    private Customer customer;
    private List<MenuItem> items = new ArrayList<>();

    public OrderBuilder(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public OrderBuilder addItem(MenuItem item) {
        this.items.add(item);
        return this;
    }
    public Order build() {
        if (customer == null) {
            throw new IllegalStateException("Покупатель должен быть установлен");
        }
        return new Order(id, customer, items);
    }
}