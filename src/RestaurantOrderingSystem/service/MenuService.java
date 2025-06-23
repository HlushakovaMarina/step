package RestaurantOrderingSystem.service;

import RestaurantOrderingSystem.exception.MenuItemNotFoundException;
import RestaurantOrderingSystem.model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuService {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeMenuItem(Long id) throws MenuItemNotFoundException {
        Optional<MenuItem> itemToRemove = menuItems.stream().filter(item -> item.getId().equals(id)).findFirst();
        if (itemToRemove.isPresent()) {
            menuItems.remove(itemToRemove.get());
        } else {
            throw new MenuItemNotFoundException("Пункт меню с идентификатором " + id + " не найден.");
        }
    }

    public Optional<MenuItem> findMenuItem(Long id) {
        return menuItems.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    public List<MenuItem> getAllMenuItems() {
        return new ArrayList<>(menuItems);
    }
}
