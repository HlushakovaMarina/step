package L24_02_2025.PaymentMethod;

public class Cash implements PaymentMethod {
    PaymentMethod cash = new Cash();


    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " наличными");
    }
}
