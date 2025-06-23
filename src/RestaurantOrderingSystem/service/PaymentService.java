package RestaurantOrderingSystem.service;

import RestaurantOrderingSystem.config.PaymentConfig;
import RestaurantOrderingSystem.exception.OrderAlreadyPaidException;
import RestaurantOrderingSystem.exception.PaymentFailedException;
import RestaurantOrderingSystem.model.Order;
import RestaurantOrderingSystem.model.Payment;
import RestaurantOrderingSystem.Enum.PaymentMethod;
import RestaurantOrderingSystem.Enum.Status;

public class PaymentService {

    public Payment processPayment(Order order, PaymentMethod method, Long paymentId) throws OrderAlreadyPaidException, PaymentFailedException {
        if (order.getStatus() == Status.PAID) {
            throw new OrderAlreadyPaidException("Заказ с идентификатором \" + order.getId() + \" уже оплачен.");
        }

        double amount = order.getTotalAmount();

        if (method == PaymentMethod.CARD) {
            double commission = PaymentConfig.getInstance(0.05).getCardCommission();
            amount += amount * commission;
        }

        // Симуляция
        boolean paymentSuccessful = simulatePayment(amount);

        if (!paymentSuccessful) {
            throw new PaymentFailedException("Платеж не прошел для заказа с идентификатором " + order.getId() + ".");
        }

        order.setStatus(Status.PAID);
        return new Payment(paymentId, amount, method);
    }

    private boolean simulatePayment(double amount) {
        return Math.random() > 0.1;
    }
}