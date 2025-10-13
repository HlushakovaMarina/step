package L13_10_2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleStoreTasks {

    //Задача 1: Найти все товары дороже заданной цен
    public static List<Product> findExpensiveProducts(Store store, double minPrice) {
        return store.getProducts().stream()
                .filter(p -> p.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    /**
     * Задача 2: Подсчитать количество товаров в магазине
     *
     * @param store - магазин
     * @return int количество товаров
     */
    public static int countProducts(Store store) {
        return store.getProducts().stream().mapToInt(Product::getStock).sum();
    }

    /**
     * Задача 3: Найти корзины, содержащие более одного экземпляра товара
     *
     * @param store - магазин
     * @return List<Cart> корзины, где есть товар с количеством больше 1
     */
    public static List<Cart> findCartsWithMultipleQuantities(Store store) {
        return store.getCarts().stream().filter(cart -> cart.getItems().stream().
                        anyMatch(cartItem -> cartItem.getQuantity() > 2))
                .toList();
    }

    /**
     * Задача 4: Найти все категории товаров в корзинах
     *
     * @param store - магазин
     * @return Set<Category> уникальные категории товаров в корзинах
     */
    public static Set<Category> findCategoriesInCarts(Store store) {
       return store.getCarts().stream()
                .flatMap(cart -> cart.getItems().stream())
                .map(p-> p.getProduct().getCategory()).collect(Collectors.toSet());

    }

    /**
     * Задача 5: Подсчитать общее количество товаров в корзине по ID
     *
     * @param store  - магазин
     * @param cartId - идентификатор корзины
     * @return int общее количество товаров в указанной корзине
     */
    public static int countItemsInCart(Store store, String cartId) {
       return store.getCarts().stream().filter(cart -> cart.getCartId().equals(cartId))
                .flatMap(cart -> cart.getItems().stream())
                .mapToInt(CartItem::getQuantity).sum();
    }

    /**
     * Задача 6: Найти товары с запасом больше заданного значения
     *
     * @param store    - магазин
     * @param minStock - минимальный запас
     * @return List<Product> товары с запасом больше minStock
     */
    public static List<Product> findHighStockProducts(Store store, int minStock) {
        return store.getProducts().stream().filter(product -> product.getStock()>minStock).toList();
    }

    /**
     * Задача 7: Проверить, есть ли товар в корзинах
     *
     * @param store     - магазин
     * @param productId - идентификатор товара
     * @return boolean true, если товар присутствует в корзинах
     */
    public static boolean isProductInCarts(Store store, String productId) {
        return store.getCarts().stream()
                .flatMap(cart-> cart.getItems().stream())
                .anyMatch(i->i.getProduct().getProductId().equals(productId));
    }

    /**
     * Задача 8: Найти корзины с товарами заданной категории
     *
     * @param store    - магазин
     * @param category - целевая категория
     * @return List<Cart> корзины, содержащие товары указанной категории
     */
    public static List<Cart> findCartsByCategory(Store store, Category category) {
        return store.getCarts().stream()
                .flatMap(cart -> cart.getItems().stream())
                .map();
    }

    /**
     * Задача 9: Найти самый дешевый товар в магазине
     *
     * @param store - магазин
     * @return Product самый дешевый товар или null, если товаров нет
     */
    public static Product findCheapestProduct(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return null;
    }

    /**
     * Задача 10: Подсчитать общее количество уникальных товаров в корзинах
     *
     * @param store - магазин
     * @return int количество уникальных товаров в корзинах
     */
    public static int countUniqueProductsInCarts(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return 0;
    }
}