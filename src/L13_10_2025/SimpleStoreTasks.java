package L13_10_2025;

import java.util.*;
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
                .map(p -> p.getProduct().getCategory()).collect(Collectors.toSet());

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
        return store.getProducts().stream().filter(product -> product.getStock() > minStock).toList();
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
                .flatMap(cart -> cart.getItems().stream())
                .anyMatch(i -> i.getProduct().getProductId().equals(productId));
    }

    /**
     * Задача 8: Найти корзины с товарами заданной категории
     *
     * @param store    - магазин
     * @param category - целевая категория
     * @return List<Cart> корзины, содержащие товары указанной категории
     */
    /*/public static List<Cart> findCartsByCategory(Store store, Category category) {
        return store.getCarts().stream()
                .flatMap(cart -> cart.getItems().stream())
                .map();
    }*/

    /**
     * Задача 11: Найти общую стоимость всех товаров на складе (price * stock для всех товаров)
     *
     * @param store - магазин
     * @return double общая стоимость (сумма price * stock)
     */
    public static double calculateTotalInventoryValue(Store store) {
       return store.getProducts().stream().mapToDouble(p->p.getPrice()*p.getStock()).sum();
    }
    /**
     * Задача 12: Найти корзины с общей стоимостью выше заданного порога
     * @param store - магазин
     * @param threshold - порог стоимости корзины
     * @return List<Cart> корзины с totalPrice > threshold
     */
    public static List<Cart> findExpensiveCarts(Store store, double threshold) {
        return store.getCarts().stream()
                .filter(cart -> cart.getTotalPrice()>threshold).toList();
    }

    /**
     * Задача 13: Подсчитать количество товаров каждой категории в магазине
     * @param store - магазин
     * @return Map<Category, Integer> количество товаров по категориям
     */
  /*  public static Map<Category, Integer> countProductsByCategory(Store store) {
        return store.getProducts().stream()
                .collect(Collectors.groupingBy(p->p.getCategory(), Collectors.counting()))
                .entrySet().stream().collect(Collectors.)
    }*/

}