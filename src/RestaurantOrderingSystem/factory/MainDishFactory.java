package RestaurantOrderingSystem.factory;

import RestaurantOrderingSystem.model.Category;
import RestaurantOrderingSystem.model.MenuItem;

public class MainDishFactory implements MenuItemFactory{
    @Override
    public MenuItem createMenuItem(int id, String name, double price, boolean isAvailable) {
        return new MenuItem(id, name, price, Category.MAIN_DISH, isAvailable);
    }

    @Override
    public Category getCategory() {
        return Category.MAIN_DISH;
    }
}
