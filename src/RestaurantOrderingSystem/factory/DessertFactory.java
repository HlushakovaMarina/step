package RestaurantOrderingSystem.factory;

import RestaurantOrderingSystem.model.Category;
import RestaurantOrderingSystem.model.MenuItem;

public class DessertFactory implements MenuItemFactory{
    @Override
    public MenuItem createMenuItem(int id, String name, double price, boolean isAvailable) {
        return new MenuItem(id, name, price, Category.DESSERT, isAvailable);
    }

    @Override
    public Category getCategory() {
        return Category.DESSERT;
    }
}
