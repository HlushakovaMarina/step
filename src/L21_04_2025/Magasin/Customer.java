package L21_04_2025.Magasin;

import java.util.List;
import java.util.Objects;

public class Customer {
    private final String name;
    private final List<GroceryItem> shoppingList;

    public Customer(String name, List<GroceryItem> shoppingList) {
        this.name = name;
        this.shoppingList = shoppingList;
    }

    public String getName() {
        return name;
    }

    public List<GroceryItem> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        return name + ": " + shoppingList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
