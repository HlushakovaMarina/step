package L13_10_2025;

public class Product {
    private String productId;
    private String name;
    private Category category;
    private double price;
    private int stock;

    public Product(String productId, String name, Category category, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Product{id='" + productId + "', name='" + name + "', category=" +
                category.getDisplayName() + ", price=" + price + ", stock=" + stock + "}";
    }
}
