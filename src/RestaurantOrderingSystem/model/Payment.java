package RestaurantOrderingSystem.model;

import RestaurantOrderingSystem.Enum.PaymentMethod;

public class Payment {
    private final Long id;
    private final double amount;
    private final PaymentMethod method;

    public Payment(Long id, double amount, PaymentMethod method) {
        this.id = id;
        this.amount = amount;
        this.method = method;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", method=" + method +
                '}';
    }
}
