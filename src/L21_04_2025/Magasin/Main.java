package L21_04_2025.Magasin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<GroceryItem > product = Arrays.asList(

                new GroceryItem ("молоко", Category.DAIRY, 3.12, true),
                new GroceryItem ("ряженка", Category.DAIRY, 2.50, true),
                new GroceryItem ("капуста", Category.VEGETABLE, 1.32, false),
                new GroceryItem ("картошка", Category.VEGETABLE, 3.4, false),
                new GroceryItem ("помидор", Category.VEGETABLE, 6.78, true),
                new GroceryItem ("помидор", Category.VEGETABLE, 7.15, true),
                new GroceryItem ("арбуз", Category.FRUIT, 7.69, true));

        List<GroceryItem> dairys = product.stream()
                .filter(groceryItem -> groceryItem.getCategory().equals(Category.DAIRY))
                .collect(Collectors.toList());
        System.out.println(dairys);

        List<String> perishabl = product.stream()
                .filter(groceryItem -> groceryItem.isPerishable())
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println(perishabl);

        product.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .forEach(System.out::println);

        List<GroceryItem> top3 = product.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3);

        product.stream()
                .map(GroceryItem::getName)
                .limit(3)
                .forEach(System.out::println);

        product.stream()
                .
    }
    }
