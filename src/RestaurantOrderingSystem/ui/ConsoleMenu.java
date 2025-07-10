package RestaurantOrderingSystem.ui;

import RestaurantOrderingSystem.Enum.PaymentMethod;
import RestaurantOrderingSystem.builder.OrderBuilder;
import RestaurantOrderingSystem.config.PaymentConfig;
import RestaurantOrderingSystem.exception.MenuItemNotFoundException;
import RestaurantOrderingSystem.exception.OrderAlreadyPaidException;
import RestaurantOrderingSystem.exception.PaymentFailedException;
import RestaurantOrderingSystem.factory.DessertFactory;
import RestaurantOrderingSystem.factory.DrinkFactory;
import RestaurantOrderingSystem.factory.MainDishFactory;
import RestaurantOrderingSystem.factory.MenuItemFactory;
import RestaurantOrderingSystem.model.Customer;
import RestaurantOrderingSystem.model.MenuItem;
import RestaurantOrderingSystem.model.Order;
import RestaurantOrderingSystem.model.Payment;
import RestaurantOrderingSystem.service.MenuService;
import RestaurantOrderingSystem.service.OrderService;
import RestaurantOrderingSystem.service.PaymentService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
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

        menuService.addMenuItem(drinkFactory.createMenuItem(1L, "Спрайт", 2.0, true));
        menuService.addMenuItem(drinkFactory.createMenuItem(2L, "Сок", 3.0, true));
        menuService.addMenuItem(mainDishFactory.createMenuItem(3L, "Бургер", 10.0, true));
        menuService.addMenuItem(dessertFactory.createMenuItem(4L, "Мороженое", 5.0, true));

        PaymentConfig.getInstance(0.05); // Initialize PaymentConfig singleton

        while (true) {
            System.out.println("\nСистема заказа ресторанов");
            System.out.println("1. Меню просмотра");
            System.out.println("2. Создать клиента");
            System.out.println("3. Создать заказ");
            System.out.println("4. Добавить товар в заказ");
            System.out.println("5. Удалить товар из заказа");
            System.out.println("6. Произвести оплату");
            System.out.println("7. Выйти");

            System.out.print("Сделайте свой выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    createCustomer();
                    break;
                case 3:
                    createOrder();
                    break;
                case 4:
                    addItemToOrder();
                    break;
                case 5:
                    removeItemFromOrder();
                    break;
                case 6:
                    makePayment();
                    break;
                case 7:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
            }
        }
    }

    private void viewMenu() {
        System.out.println("\n--- Меню ---");
        List<MenuItem> menu = menuService.getAllMenuItems();
        if (menu.isEmpty()) {
            System.out.println("Нет пунктов в меню.");
            return;
        }
        menu.forEach(System.out::println);
    }

    private Customer currentCustomer;

    private void createCustomer() {
        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон клиента: ");
        String phone = scanner.nextLine();

        currentCustomer = new Customer(nextCustomerId++, name, phone);
        System.out.println("Клиент создан: " + currentCustomer);
    }

    private Order currentOrder;

    private void createOrder() {
        if (currentCustomer == null) {
            System.out.println("Пожалуйста, сначала создайте клиента.");
            return;
        }

        currentOrder = new OrderBuilder(nextOrderId++).setCustomer(currentCustomer).build();
        System.out.println("Заказ создан для клиента " + currentCustomer.getName() + " с идентификатором заказа: " + currentOrder.getId());
    }

    private void addItemToOrder() {
        if (currentOrder == null) {
            System.out.println("Пожалуйста, сначала создайте заказ.");
            return;
        }

        System.out.print("Введите идентификатор пункта меню, который нужно добавить в заказ: ");
        try {
            Long itemId = scanner.nextLong();
            scanner.nextLine();

            Optional<MenuItem> menuItem = menuService.findMenuItem(itemId);
            if (menuItem.isPresent()) {
                orderService.addItemToOrder(currentOrder, menuItem.get());
                System.out.println("Добавлен элемент " + menuItem.get().getName() + " заказать " + currentOrder.getId());
                System.out.println("Общая сумма текущего заказа: " + currentOrder.getTotalAmount());
            } else {
                System.out.println("Пункт меню с идентификатором " + itemId + " не найдено.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод. Введите действительный идентификатор пункта меню.");
            scanner.nextLine();
        }
    }
    private void removeItemFromOrder() {
        if (currentOrder == null) {
            System.out.println("Пожалуйста, сначала создайте заказ.");
            return;
        }

        System.out.print("Введите идентификатор пункта меню, который необходимо удалить из заказа: ");
        try {
            Long itemId = scanner.nextLong();
            scanner.nextLine();

            try {
                orderService.removeItemFromOrder(currentOrder, itemId, menuService);
                System.out.println("Удалённый элемент с идентификатором " + itemId + " из заказа " + currentOrder.getId());
                System.out.println("Общая сумма текущего заказа: " + currentOrder.getTotalAmount());
            } catch (MenuItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод. Введите действительный идентификатор пункта меню.");
            scanner.nextLine();
        }
    }

    private void makePayment() {
        if (currentOrder == null) {
            System.out.println("Пожалуйста, сначала создайте заказ.");
            return;
        }

        System.out.println("Общая сумма текущего заказа: " + currentOrder.getTotalAmount());
        System.out.println("Выберите способ оплаты: ");
        System.out.println("1. Наличные");
        System.out.println("2. Карта");
        System.out.print("Сделайте свой выбор: ");

        try {
            int paymentChoice = scanner.nextInt();
            scanner.nextLine();

            PaymentMethod paymentMethod;
            if (paymentChoice == 1) {
                paymentMethod = PaymentMethod.CASH;
            } else if (paymentChoice == 2) {
                paymentMethod = PaymentMethod.CARD;
            } else {
                System.out.println("Неверный выбор способа оплаты.");
                return;
            }

            try {
                Payment payment = paymentService.processPayment(currentOrder, paymentMethod, nextPaymentId++);
                System.out.println("Платеж прошёл успешно! Информация о платеже: " + payment);
                System.out.println("Статус заказа: " + currentOrder.getStatus());

            } catch (OrderAlreadyPaidException | PaymentFailedException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод. Пожалуйста, укажите допустимый способ оплаты.");
            scanner.nextLine();
        }
    }


    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu();
        menu.run();
    }

}
