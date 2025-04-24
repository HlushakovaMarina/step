package L21_04_2025.Magasin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
        product.forEach(item -> System.out.println(
                item.getName() + ": " + (item.getPrice() * 0.9)
                        + " Br"));
        // 7. Есть ли товар дешевле 1 Br?
        boolean anyCheaperThan1 = product.stream().anyMatch(item -> item.getPrice() < 1.0);
        System.out.println("7. Есть ли товар дешевле 1 Br? " + anyCheaperThan1);

        // 8. Все ли товары дороже 0?
        boolean allPositivePrices = product.stream().allMatch(item -> item.getPrice() > 0);
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
    }
    }

