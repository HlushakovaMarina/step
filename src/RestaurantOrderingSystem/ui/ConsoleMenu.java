package RestaurantOrderingSystem.ui;

import RestaurantOrderingSystem.config.PaymentConfig;
import RestaurantOrderingSystem.factory.DessertFactory;
import RestaurantOrderingSystem.factory.DrinkFactory;
import RestaurantOrderingSystem.factory.MainDishFactory;
import RestaurantOrderingSystem.factory.MenuItemFactory;
import RestaurantOrderingSystem.service.MenuService;
import RestaurantOrderingSystem.service.OrderService;
import RestaurantOrderingSystem.service.PaymentService;

import java.util.Scanner;

public class ConsoleMenu {
    private final MenuService menuService = new MenuService();
    private final OrderService orderService = new OrderService();
    private final PaymentService paymentService = new PaymentService();
    private final Scanner scanner = new Scanner(System.in);

    private Long nextCustomerId = 1L;
    private Long nextOrderId = 1L;
    private Long nextPaymentId = 1L;

    public void run() {
        MenuItemFactory drinkFactory = new DrinkFactory();
        MenuItemFactory mainDishFactory = new MainDishFactory();
        MenuItemFactory dessertFactory = new DessertFactory();

        menuService.addMenuItem(drinkFactory.createMenuItem(1L, "Coca-Cola", 2.0, true));
        menuService.addMenuItem(drinkFactory.createMenuItem(2L, "Juice", 3.0, true));
        menuService.addMenuItem(mainDishFactory.createMenuItem(3L, "Burger", 10.0, true));
        menuService.addMenuItem(dessertFactory.createMenuItem(4L, "Ice Cream", 5.0, true));

        PaymentConfig.getInstance(0.05);


}
