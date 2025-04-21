package L21_04_2025.Magasin;

public class GroceryItem {
    private final String name;
    private final Category category;      // категория товара
    private final double price;           // цена в рублях
    private final boolean perishable;

    public GroceryItem(String name, Category category, double price, boolean perishable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.perishable = perishable;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPerishable() {
        return perishable;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", perishable=" + perishable +
                '}';
    }
}
