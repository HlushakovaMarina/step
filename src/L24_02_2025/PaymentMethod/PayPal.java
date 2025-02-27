package L24_02_2025.PaymentMethod;

import java.util.Objects;

public class PayPal implements PaymentMethod, Cloneable {
    private String email;

    public PayPal(String email) {
        this.email=email;
    }

        @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal аккаунт " + email);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PayPal payPal = (PayPal) o;
        return Objects.equals(email, payPal.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "Paypal по имейлу";
    }

    @Override
    public PayPal clone() {
        try {
            PayPal clone = (PayPal) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

}
