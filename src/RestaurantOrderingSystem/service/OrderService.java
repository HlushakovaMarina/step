package RestaurantOrderingSystem.service;

import RestaurantOrderingSystem.exception.MenuItemNotFoundException;
import RestaurantOrderingSystem.model.MenuItem;
import RestaurantOrderingSystem.model.Order;

public class OrderService {

    public void addItemToOrder(Order order, MenuItem item) {
        order.getItems().add(item);
        recalculateTotal(order);
    }
    public void removeItemFromOrder(Order order, Long itemId, MenuService menuService) throws MenuItemNotFoundException {
        MenuItem itemToRemove = menuService.findMenuItem(itemId)
                .orElseThrow(() -> new MenuItemNotFoundException("Пункт меню с идентификатором " + itemId + " не найден в заказе."));
        order.getItems().remove(itemToRemove);
        recalculateTotal(order);
    }

    public void recalculateTotal(Order order) {
        double total = order.getItems().stream().mapToDouble(MenuItem::getPrice).sum();
        order.setTotalAmount(total);
    }
}
