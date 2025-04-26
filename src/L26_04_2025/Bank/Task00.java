package L26_04_2025.Bank;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task00 {
    public static void main(String[] args) {

        List<BankAccount> accounts = List.of(
                new BankAccount("12345", "Иван Иванов", List.of(
                        new Transaction(LocalDate.of(2025, 1, 5), Type.DEPOSIT, 500.0),
                        new Transaction(LocalDate.of(2025, 2, 10), Type.WITHDRAWAL, 120.0)
                )),
                new BankAccount("67890", "Мария Петрова", List.of(
                        new Transaction(LocalDate.of(2025, 3, 1), Type.DEPOSIT, 1500.0),
                        new Transaction(LocalDate.of(2025, 3, 5), Type.WITHDRAWAL, 200.0),
                        new Transaction(LocalDate.of(2025, 3, 7), Type.DEPOSIT, 300.0)
                )),
                new BankAccount("54321", "Олег Смирнов", List.of(
                        new Transaction(LocalDate.of(2025, 4, 1), Type.WITHDRAWAL, 50.0)
                ))
        );
// 1. **Все суммы транзакций**
        List<Double> sumTransaction = accounts.stream().flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream()
                        .map(Transaction::getAmount))
                .collect(Collectors.toList());

        System.out.println(sumTransaction);

        //2. **Список депозитов**
        List<Transaction> deposit = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> transaction.getType() == Type.DEPOSIT)
                .collect(Collectors.toList());
        System.out.println(deposit);

        //3. **Даты снятий**
        List<LocalDate> withdrawalDates = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> transaction.getType() == Type.WITHDRAWAL)
                .map(Transaction::getDate).toList();
        System.out.println(withdrawalDates);

        //4. **Имена владельцев**
        accounts.stream()
                .map(BankAccount::getOwnerName)
                .forEach(System.out::println);

        //5. **Большие транзакции**
        List<Transaction> collect = accounts.stream().flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .filter(transaction -> transaction.getAmount() > 1000)
                .collect(Collectors.toList());
        System.out.println(collect);

        //6. **Сортировка по сумме**
        List<Transaction> collect1 = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());
        System.out.println(collect1);

        //7. **Топ‑2 снятия**
        List<Transaction> top2 = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions().stream())
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .limit(2)
                .toList();
        System.out.println(top2);

        //8. **Количество транзакций по счёту**
        accounts
                .forEach(bankAccount -> System.out.println(bankAccount.getAccountNumber() +
                        " " + bankAccount.getTransactions().size()));

        //9. **Пустые счета**
        boolean b = accounts.stream()
                .anyMatch(transaction -> transaction.getTransactions().isEmpty());
        System.out.println(b);


    }
}
