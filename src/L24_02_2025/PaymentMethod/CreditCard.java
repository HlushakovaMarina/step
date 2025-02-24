package L24_02_2025.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private long cardNumber;
    private String cardHolder;

    public CreditCard(int cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount  + cardHolder + " Иван Иванов");
    }

}
