package L24_02_2025.PaymentMethod;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email=email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal аккаунт " + email);
    }
}
