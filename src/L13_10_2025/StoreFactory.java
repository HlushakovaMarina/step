package L13_10_2025;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StoreFactory {
    public static Store createSampleStore() {
        Store store = new Store("S001", "Simple Shop");

        // Создаем продукты
        List<Product> products = createProducts();
        store.setProducts(products);

        // Создаем корзины
        List<Cart> carts = createCarts(products);
        store.setCarts(carts);

        return store;
    }

    private static List<Product> createProducts() {
        return Arrays.asList(
                new Product("P001", "Smartphone", Category.ELECTRONICS, 299.99, 50),
                new Product("P002", "T-Shirt", Category.CLOTHING, 19.99, 100),
                new Product("P003", "Coffee", Category.FOOD, 9.99, 200),
                new Product("P004", "Novel", Category.BOOKS, 14.99, 80),
                new Product("P005", "Headphones", Category.ELECTRONICS, 49.99, 60),
                new Product("P006", "Jeans", Category.CLOTHING, 39.99, 70),
                new Product("P007", "Cookies", Category.FOOD, 4.99, 150),
                new Product("P008", "Textbook", Category.BOOKS, 29.99, 40)
        );
    }

    private static List<Cart> createCarts(List<Product> products) {
        Random random = new Random();
        return IntStream.range(1, 11)
                .mapToObj(i -> {
                    String cartId = String.format("CART%03d", i);
                    Cart cart = new Cart(cartId);

                    // Добавляем 1-3 случайных товара в корзину
                    int numItems = random.nextInt(3) + 1;
                    Set<Product> selectedProducts = new HashSet<>();
                    while (selectedProducts.size() < numItems) {
                        selectedProducts.add(products.get(random.nextInt(products.size())));
                    }

                    List<CartItem> items = selectedProducts.stream()
                            .map(product -> new CartItem(product, random.nextInt(5) + 1))
                            .collect(Collectors.toList());

                    cart.setItems(items);
                    return cart;
                })
                .collect(Collectors.toList());
    }
}
