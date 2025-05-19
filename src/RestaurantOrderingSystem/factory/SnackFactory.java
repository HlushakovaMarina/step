package RestaurantOrderingSystem.factory;

import RestaurantOrderingSystem.Enum.Category;
import RestaurantOrderingSystem.model.MenuItem;

public class SnackFactory implements MenuItemFactory{
    @Override
    public MenuItem createMenuItem(int id, String name, double price, boolean isAvailable) {
        return new MenuItem(id, name, price, Category.SNACK, isAvailable);
    }

    @Override
    public Category getCategory() {
        return Category.SNACK;
    }
}
