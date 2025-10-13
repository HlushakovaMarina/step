package L13_10_2025;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeId;
    private String name;
    private List<Product> products;
    private List<Cart> carts;

    public Store(String storeId, String name) {
        this.storeId = storeId;
        this.name = name;
        this.products = new ArrayList<>();
        this.carts = new ArrayList<>();
    }

    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
    public List<Cart> getCarts() { return carts; }
    public void setCarts(List<Cart> carts) { this.carts = carts; }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    @Override
    public String toString() {
        return "Store{storeId='" + storeId + "', name='" + name +
                "', products=" + products.size() + ", carts=" + carts.size() + "}";
    }
}
