package L24_02_2025.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(12345678910111L, "Иван Иванов");
        PaymentMethod payPal = new PayPal("truhina_m@mail.ru");
        PaymentMethod cash = new Cash();
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        double amount = 150.0;
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(amount);

        }
    }
}
