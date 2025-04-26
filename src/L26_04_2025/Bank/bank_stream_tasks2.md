# Модель: Банковские счета и транзакции


## 📋 Классы

### 1. `Transaction`

```java
import java.time.LocalDate;

public class Transaction {
    public enum Type { DEPOSIT, WITHDRAWAL }

    private final LocalDate date;
    private final Type type;
    private final double amount;

    public Transaction(LocalDate date, Type type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public LocalDate getDate() { return date; }
    public Type      getType() { return type; }
    public double    getAmount() { return amount; }

    @Override
    public String toString() {
        return date + " " + type + " " + amount + " Br";
    }
}
```

---

### 2. `BankAccount`

```java
import java.util.List;

public class BankAccount {
    private final String accountNumber;      // номер счёта
    private final String ownerName;          // имя владельца
    private final List<Transaction> transactions;

    public BankAccount(String accountNumber, String ownerName, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.transactions = transactions;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName()    { return ownerName; }
    public List<Transaction> getTransactions() { return transactions; }

    @Override
    public String toString() {
        return ownerName + " (" + accountNumber + ")";
    }
}
```

---

## 🏆 Упражнения (Stream API)

Пусть у вас есть список всех счетов:

```java
List<BankAccount> accounts = List.of(
    new BankAccount("12345", "Иван Иванов", List.of(
        new Transaction(LocalDate.of(2025,1,5),  Transaction.Type.DEPOSIT,    500.0),
        new Transaction(LocalDate.of(2025,2,10), Transaction.Type.WITHDRAWAL, 120.0)
    )),
    new BankAccount("67890", "Мария Петрова", List.of(
        new Transaction(LocalDate.of(2025,3,1),  Transaction.Type.DEPOSIT,    1500.0),
        new Transaction(LocalDate.of(2025,3,5),  Transaction.Type.WITHDRAWAL, 200.0),
        new Transaction(LocalDate.of(2025,3,7),  Transaction.Type.DEPOSIT,    300.0)
    )),
    new BankAccount("54321", "Олег Смирнов", List.of(
        new Transaction(LocalDate.of(2025,4,1),  Transaction.Type.WITHDRAWAL, 50.0)
    ))
);
```

1. **Все суммы транзакций**  
   Соберите `List<Double>` всех сумм:  
 
2. **Список депозитов**  
   Получите `List<Transaction>` только депозитов:  
s
3. **Даты снятий**  
   Соберите `List<LocalDate>` дат снятий:  

4. **Имена владельцев**  
   Распечатайте всех владельцев:  

5. **Большие транзакции**  
   Найдите транзакции больше 1000 Br:  

6. **Сортировка по сумме**  
   Отсортируйте все транзакции по возрастанию суммы:  

7. **Топ‑2 снятия**  
   Выберите List<Transaction> top2, два самых крупных снятия:  
   *Усложнение, не List а Класс типа Pair которые будет содержать top1 и top2

8. **Количество транзакций по счёту**  
   Выведите `accountNumber` и число транзакций:  

9. **Пустые счета**  
   Проверьте, есть ли счёт без транзакций:  

10. **Владельцы с депозитами**  
    Соберите `Set<String>` имён владельцев, которые делали депозиты:  
