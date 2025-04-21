# Задача: Работа с коллекцией товаров магазина (Stream API)

В этой задаче предстоит попрактиковаться с **Stream API** в Java, применив операции `filter`, `map`, `sorted`, `limit`, `collect` и `forEach` на понятном примере товаров из продуктового магазина.

---

## 📋 Класс `GroceryItem`

```java
public class GroceryItem {
    private final String name;
    private final Category category;      // категория товара
    private final double price;           // цена в рублях
    private final boolean perishable;     // скоропортящийся?

    public GroceryItem(String name, Category category, double price, boolean perishable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.perishable = perishable;
    }
    public String    getName()        { return name; }
    public Category  getCategory()    { return category; }
    public double    getPrice()       { return price; }
    public boolean   isPerishable()   { return perishable; }

    @Override
    public String toString() {
        return name + " (" + category + ", " + price + " Br" +
               (perishable ? ", скоропортящийся)" : ")");
    }
}

 public enum Category { VEGETABLE, FRUIT, DAIRY, BAKERY, MEAT, BEVERAGE }
```

## 🏆 Упражнения

1. **Молочка**  
   Используя **`filter`**, получите список всех товаров с `Category.DAIRY`.

2. **Скоропортящиеся товары**  
   С помощью **`filter`** и **`map`**, получите `List<String>` имён всех скоропортящихся товаров (`isPerishable() == true`).

3. **Сортировка по возрастанию цены**  
   Отсортируйте поток товаров по цене с помощью  

4. **Топ‑3 самых дорогих**  
   Отсортируйте товары по убыванию цены и выберите первые 3 элемента (`limit(3)`).

5. **Сбор названий топ‑3**  
   После задачи 4,  верните `List<String>` названий.

6. **Печать со скидкой**  
   Используйте **`forEach`**, чтобы вывести строку  
   ```
   <name>: <price * 0.9> Br
   ```
   для каждого товара.

7. **Есть ли товар дешевле 1 Br?**  
   С помощью **`anyMatch`** проверьте, существует ли дешевый товар.

8. **Все ли товары дороже 0?**  
   Проверьте через **`allMatch`**, что цена каждого товара положительна.

9. **Первая овощная позиция**  
   Найдите первый товар категории `VEGETABLE` через  
   ```java
   findFirst()
   ```  
   Результат оберните в `Optional<GroceryItem>`.

10. **Уникальные категории**  
    Получите `List<Category>` всех уникальных категорий товаров.

---

> **Совет:** создайте в `main()` список тестовых `GroceryItem` и проверьте каждое упражнение, выводя результат в консоль.
