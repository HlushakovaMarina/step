package RestaurantOrderingSystem.factory;

import RestaurantOrderingSystem.Enum.Category;
import RestaurantOrderingSystem.model.MenuItem;

public class DessertFactory implements MenuItemFactory{
    @Override
    public MenuItem createMenuItem(Long id, String name, double price, boolean isAvailable) {
        return new MenuItem(id, name, price, getCategory(), isAvailable);
    }

    @Override
    public Category getCategory() {
        return Category.DESSERT;
    }
}
