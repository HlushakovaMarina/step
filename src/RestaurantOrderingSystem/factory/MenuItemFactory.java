package RestaurantOrderingSystem.factory;


import RestaurantOrderingSystem.model.Category;
import RestaurantOrderingSystem.model.MenuItem;

public interface MenuItemFactory {
    MenuItem createMenuItem(int id,String name, double price, boolean isAvailable);
    Category getCategory();
}
