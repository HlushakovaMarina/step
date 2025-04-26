package L21_04_2025.Magasin;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<GroceryItem> product = Arrays.asList(
                new GroceryItem("молоко", Category.DAIRY, 3.12, true),
                new GroceryItem("ряженка", Category.DAIRY, 2.50, true),
                new GroceryItem("капуста", Category.VEGETABLE, 1.32, false),
                new GroceryItem("картошка", Category.VEGETABLE, 3.4, false),
                new GroceryItem("помидор", Category.VEGETABLE, 6.78, true),
                new GroceryItem("киви", Category.FRUIT, 7.15, true),
                new GroceryItem("арбуз", Category.FRUIT, 7.69, true));

        List<Customer> customers = List.of(
                new Customer("Андрей", List.of(
                        new GroceryItem("Milk", Category.DAIRY, 1.2, true),
                        new GroceryItem("Bread", Category.BAKERY, 0.8, true)
                )),
                new Customer("Ирина", List.of(
                        new GroceryItem("Apple", Category.FRUIT, 0.5, true),
                        new GroceryItem("Wine", Category.BEVERAGE, 5.0, false),
                        new GroceryItem("Cheese", Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                )),
                new Customer("Катя", List.of()));

        // 1.Молочка
        List<GroceryItem> dairys = product.stream()
                .filter(groceryItem -> groceryItem.getCategory().equals(Category.DAIRY))
                .collect(Collectors.toList());
        System.out.println("1. Молочные продукты: " + dairys);

        // 2. Скоропортящиеся товары
        List<String> perishabl = product.stream()
                .filter(groceryItem -> groceryItem.isPerishable())
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println("2. Скоропортящиеся товары: " + perishabl);

        // 3. Сортировка по возрастанию цены
        product.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .forEach(System.out::println);

        // 4. Топ-3 самых дорогих
        List<GroceryItem> top3 = product.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("4. Топ-3 самых дорогих: " + top3);

        // 5. Сбор названий топ-3
        product.stream()
                .map(GroceryItem::getName)
                .limit(3)
                .forEach(System.out::println);

        // 6. Печать со скидкой
        System.out.println("6. Цена со скидкой:");
        product.forEach(p1 -> System.out.println(
                p1.getName() + ": " + (p1.getPrice() * 0.9)
                        + " Br"));
        // 7. Есть ли товар дешевле 1 Br?
        boolean anyCheaperThan1 = product.stream().anyMatch(p2 -> p2.getPrice() < 1.0);
        System.out.println("7. Есть ли товар дешевле 1 Br? " + anyCheaperThan1);

        // 8. Все ли товары дороже 0?
        boolean allPositivePrices = product.stream().allMatch(p -> p.getPrice() > 0);
        System.out.println("8. Все ли товары дороже 0? " + allPositivePrices);

        // 9. Первая овощная позиция
        Optional<GroceryItem> firstVegetable = product.stream()
                .filter(p -> p.getCategory() == Category.VEGETABLE)
                .findFirst();
        System.out.println("9. Первая овощная позиция: " + firstVegetable);

        // 10. Уникальные категории
        List<Category> uniqueCategories = product.stream()
                .map(GroceryItem::getCategory)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("10. Уникальные категории: " + uniqueCategories);

        // 1.  flatMap по клиентам
        List<GroceryItem> c1 = customers.stream()
                .flatMap(l -> l.getShoppingList().stream())
                .collect(Collectors.toList());
        System.out.println("Все покупки: " + c1);

        // 2. Сколько всего покупателей?
        long count = customers.stream().map(Customer::getName).count();
        System.out.println("Количество покупателей: " + count);

        // 3. Самый щедрый покупатель
        Optional<Customer> max = customers.stream()
                .max(Comparator.comparingDouble(c -> c.getShoppingList().stream()
                        .mapToDouble(GroceryItem::getPrice).sum()));
        System.out.println("Самый щедрый покупатель: " + max);

        // 4. Уникальные товары
        Set<String> collect = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .map(GroceryItem::getName).collect(Collectors.toSet());
        System.out.println("Уникальные товары: " + collect);

        // 5. Таблица покупок по категориям
        Map<Category, Set<String>> map = customers.stream()
                .flatMap(c->c.getShoppingList().stream())
                .collect(Collectors.groupingBy(
                        GroceryItem::getCategory,
                        Collectors.flatMapping(item -> customers.stream()
                                .filter(c -> c.getShoppingList().contains(item))
                                .map(Customer::getName), Collectors.toSet())));

        // 6. Optional — покупатель без покупок
        Optional<Customer> emptyCustomer = customers.stream()
                .filter(customer -> customer.getShoppingList().isEmpty())
                .findFirst();
        System.out.println("Покупатель без покупок: " + emptyCustomer);

        // 7. Collectors.summarizingDouble для каждого клиента
        Map<String, DoubleSummaryStatistics> customerSumStatistics = customers.stream()
                .collect(Collectors.toMap(Customer::getName, customer -> customer.getShoppingList()
                        .stream().collect(Collectors.summarizingDouble(GroceryItem::getPrice))));
        System.out.println("Суммарная статистика цен для каждого покупателя: " + customerSumStatistics);

        // 8. peek - уведомления
        customers.stream()
                .peek(c -> System.out.println("Обрабатываем " + c.getName()))
                .forEach(System.out::println);

        // 9. skip + limit по клиентам
        List<Customer> sequence = customers.stream()
                .skip(1)
                .limit(2)
                .toList();
        System.out.println("Пропустили первого и выбрали следующих двоих: " + sequence);
    }
}

