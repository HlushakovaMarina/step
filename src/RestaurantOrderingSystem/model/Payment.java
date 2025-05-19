package RestaurantOrderingSystem.model;

import RestaurantOrderingSystem.Enum.PaymentMethod;

public class Payment {
    private final int id;
    private final double amount;
    private final PaymentMethod method;

    public Payment(int id, double amount, PaymentMethod method) {
        this.id = id;
        this.amount = amount;
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }
}
