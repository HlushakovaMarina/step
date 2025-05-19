package RestaurantOrderingSystem.factory;


import RestaurantOrderingSystem.Enum.Category;
import RestaurantOrderingSystem.model.MenuItem;

public interface MenuItemFactory {
    MenuItem createMenuItem(int id,String name, double price, boolean isAvailable);
    Category getCategory();
}
