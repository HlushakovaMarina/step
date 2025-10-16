package L13_10_2025;

import java.util.List;
import java.util.Set;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = StoreFactory.createSampleStore();

        System.out.println("=== Магазин ===");
        System.out.println(store);

        System.out.println("\n=== Продукты ===");
        store.getProducts().forEach(System.out::println);

        System.out.println("\n=== Корзины ===");
        store.getCarts().forEach(System.out::println);

        // Задача 1
        System.out.println("\n=== Товары дороже 50 ===");
        List<Product> expensiveProducts = SimpleStoreTasks.findExpensiveProducts(store, 50.0);
        expensiveProducts.forEach(System.out::println);

        // Задача 2
        System.out.println("\n=== Количество товаров в магазине ===");
        System.out.println(SimpleStoreTasks.countProducts(store));

        // Задача 3
        System.out.println("\n=== Корзины с товарами количеством больше 1 ===");
        List<Cart> multiQuantityCarts = SimpleStoreTasks.findCartsWithMultipleQuantities(store);
        multiQuantityCarts.forEach(System.out::println);

        // Задача 4
        System.out.println("\n=== Категории товаров в корзинах ===");
        Set<Category> categoriesInCarts = SimpleStoreTasks.findCategoriesInCarts(store);
        categoriesInCarts.forEach(category -> System.out.println(category.getDisplayName()));

        // Задача 5
        System.out.println("\n=== Количество товаров в корзине CART001 ===");
        System.out.println(SimpleStoreTasks.countItemsInCart(store, "CART001"));

        // Задача 6
        System.out.println("\n=== Товары с запасом больше 100 ===");
        List<Product> highStockProducts = SimpleStoreTasks.findHighStockProducts(store, 100);
        highStockProducts.forEach(System.out::println);

        // Задача 7
        System.out.println("\n=== Наличие товара P001 в корзинах ===");
        System.out.println(SimpleStoreTasks.isProductInCarts(store, "P001"));

       /* // Задача 8
        System.out.println("\n=== Корзины с товарами категории Книги ===");
        List<Cart> bookCarts = SimpleStoreTasks.findCartsByCategory(store, Category.BOOKS);
        bookCarts.forEach(System.out::println);

        // Задача 9
        System.out.println("\n=== Самый дешевый товар ===");
        Product cheapestProduct = SimpleStoreTasks.findCheapestProduct(store);
        System.out.println(cheapestProduct != null ? cheapestProduct : "Нет товаров");

        // Задача 10
        System.out.println("\n=== Количество уникальных товаров в корзинах ===");
        System.out.println(SimpleStoreTasks.countUniqueProductsInCarts(store));
    }*/
        //Задача 11.
        System.out.println("\n=== общая стоимость всех товаров на складе ===");
        System.out.println(SimpleStoreTasks.calculateTotalInventoryValue(store));

        // 12.
        System.out.println("\n=== корзины с общей стоимостью выше заданного порога ===");
        System.out.println(SimpleStoreTasks.findExpensiveCarts(store, 150));
    }
}