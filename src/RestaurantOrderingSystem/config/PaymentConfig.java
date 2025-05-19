package RestaurantOrderingSystem.config;

public class PaymentConfig {
    private static PaymentConfig instance;
    private final double cardCommission;

    private PaymentConfig(double cardCommission) {
        this.cardCommission = cardCommission;
    }

    public static PaymentConfig getInstance(double cardCommission) {
        if (instance == null) {
            instance = new PaymentConfig(cardCommission);
        }
        return instance;
    }

    public double getCardCommission() {
        return cardCommission;
    }
}
