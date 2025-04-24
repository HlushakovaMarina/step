# Обновлённая модель: Клиенты и их покупки

Добавим **класс `Customer`**, чтобы связать имя покупателя с его списком покупок.

---

## 📋 Классы

### 1. `GroceryItem`

```java
public class GroceryItem {
    private final String name;
    private final Category category;
    private final double price;
    private final boolean perishable;

    public GroceryItem(String name, Category category, double price, boolean perishable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.perishable = perishable;
    }
    public String    getName()      { return name; }
    public Category  getCategory()  { return category; }
    public double    getPrice()     { return price; }
    public boolean   isPerishable() { return perishable; }

    @Override
    public String toString() {
        return name + " (" + category + ", " + price + " Br" +
               (perishable ? ", скоропортящийся)" : ")");
    }

    public enum Category { VEGETABLE, FRUIT, DAIRY, BAKERY, MEAT, BEVERAGE }
}
```

---

### 2. `Customer`

```java
import java.util.List;

public class Customer {
    private final String name;
    private final List<GroceryItem> shoppingList;

    public Customer(String name, List<GroceryItem> shoppingList) {
        this.name = name;
        this.shoppingList = shoppingList;
    }
    public String getName() {
        return name;
    }
    public List<GroceryItem> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        return name + ": " + shoppingList;
    }
}
```

---

## 🏆 Обновлённые упражнения с `List<Customer>`

Пусть у вас есть список покупателей:

```java
List<Customer> customers = List.of(
    new Customer("Андрей", List.of(
        new GroceryItem("Milk", GroceryItem.Category.DAIRY, 1.2, true),
        new GroceryItem("Bread", GroceryItem.Category.BAKERY, 0.8, true)
    )),
    new Customer("Ирина", List.of(
        new GroceryItem("Apple", GroceryItem.Category.FRUIT, 0.5, true),
        new GroceryItem("Wine", GroceryItem.Category.BEVERAGE, 5.0, false),
        new GroceryItem("Cheese", GroceryItem.Category.DAIRY, 3.0, true)
    )),
    new Customer("Сергей", List.of(
        new GroceryItem("Eggs", GroceryItem.Category.DAIRY, 2.0, true),
        new GroceryItem("Chocolate", GroceryItem.Category.BAKERY, 1.5, false)
    ))
);
```

### 1. **flatMap по клиентам**  
Получить **единый поток** всех покупок всех клиентов и собрать `List<GroceryItem>`.

### 2. **Сколько всего покупателей?**  
Через `map(Customer::getName)` и `count()` вывести численность клиентов.

### 3. **Самый щедрый покупатель**  
Найдите клиента, у которого **максимальная сумма покупок**.  


### 4. **Уникальные товары**  
Соберите `Set<String>` названий всех купленных товаров:


### 5. **Таблица покупок по категориям**  

Результат: `Map<Category, Set<String>>`, где ключ — категория, значение — имена покупателей, купивших товары этой категории.

### 6. **Optional — покупатель без покупок**  
Создайте `Optional<Customer>` первого клиента, у которого список покупок пуст:


### 7. **Collectors.summarizingDouble для каждого клиента**  
Постройте `Map<String, DoubleSummaryStatistics>` суммарной статистики цен для каждого покупателя:

### 8. **peek — уведомления**  
При выводе каждого клиента используйте `.peek(c -> System.out.println("Обрабатываем " + c.getName()))`.


### 9. **skip + limit по клиентам**  
Пропустите первого покупателя и выберите следующих двоих:

---

> **Совет:** выполните каждый шаг в `main()`, распечатывая результат; экспериментируйте с разными данными.