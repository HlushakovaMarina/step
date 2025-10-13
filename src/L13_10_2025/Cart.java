package L13_10_2025;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String cartId;
    private List<CartItem> items;

    public Cart(String cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
    }

    public String getCartId() { return cartId; }
    public void setCartId(String cartId) { this.cartId = cartId; }
    public List<CartItem> getItems() { return items; }
    public void setItems(List<CartItem> items) { this.items = items; }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Cart{cartId='" + cartId + "', items=" + items.size() +
                ", total=" + String.format("%.2f", getTotalPrice()) + "}";
    }
}
