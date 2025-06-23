package RestaurantOrderingSystem.builder;

import RestaurantOrderingSystem.model.Customer;
import RestaurantOrderingSystem.model.MenuItem;
import RestaurantOrderingSystem.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private Long id;
    private Customer customer;
    private final List<MenuItem> items = new ArrayList<>();

    public OrderBuilder(Long id) {
        this.id = id;
    }

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder addItem(MenuItem item) {
        this.items.add(item);
        return this;
    }

    public Order build() {
        if (customer == null) {
            throw new IllegalStateException("Покупатель должен быть установлен");
        }
        return new Order(id, customer, new ArrayList<>(items));
    }
}