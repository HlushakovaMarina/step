package L24_03_2025.OnlineTicketShop;

public enum TicketType {
    VIP(1000, "Зал с мягкими креслами и напитками"),
    STANDARD(500, "Обычное место"),
    STUDENT(500, "Студенческий билет + скидка");
    private final int price;
    public final String description;

    TicketType(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
