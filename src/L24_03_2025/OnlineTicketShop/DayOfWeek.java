package L24_03_2025.OnlineTicketShop;

public enum DayOfWeek {
    MONDAY(0),
    WEDNESDAY(10),
    FRIDAY(15),
    SUNDAY(20);
    private final int discountPercent;

    DayOfWeek(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
