package L24_02_2025.PaymentMethod;


public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(12345678910111L, "Иван Иванов");
        PaymentMethod payPal = new PayPal("truhina_m@mail.ru");
        PaymentMethod cash = new Cash();
        PaymentMethod creditCard1 = new CreditCard(1111111111111L, "Илья Петров");
        PaymentMethod payPal1 = new PayPal("tjdigjer_k@gmail.com");
        PaymentMethod[] paymentMethods = {creditCard, payPal, cash, creditCard1, payPal1};
        double amount = 150.0;
        /*for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(amount);}*/

        System.out.println("Сравнить кредитки creditCard == creditCard1 " + (creditCard == creditCard1));
        System.out.println("Сравнить системы payPal == payPal1 " + (payPal == payPal1));
        System.out.println(creditCard1.toString());
        System.out.println(creditCard.toString());
        System.out.println("Сравнить кредитки creditCard == creditCard1 " + creditCard.equals(creditCard1));
        System.out.println("Сравнить системы payPal == payPal1 " + payPal.equals(payPal1));
    }

}

