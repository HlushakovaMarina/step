package L24_03_2025.OnlineTicketShop;

public class Ticket {
    private String buyerName;
    private TicketType type;

    public Ticket(String buyerName, TicketType type) {
        this.buyerName = buyerName;
        this.type = type;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public TicketType getType() {
        return type;
    }
}
