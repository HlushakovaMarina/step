package RestaurantOrderingSystem.model;

import RestaurantOrderingSystem.Enum.Category;

public class MenuItem {
    private final Long id;
    private final String name;
    private final double price;
    private final Category category;
    private boolean isAvailable;

    public MenuItem(Long id, String name, double price, Category category, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
