package L24_02_2025.PaymentMethod;

public class PayPal implements PaymentMethod {
    private String email;

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "PayPal " + email);
    }
}
