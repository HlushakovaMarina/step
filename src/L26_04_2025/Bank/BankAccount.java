package L26_04_2025.Bank;

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
