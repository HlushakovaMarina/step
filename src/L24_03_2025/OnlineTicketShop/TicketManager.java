package L24_03_2025.OnlineTicketShop;

import java.util.*;

public class TicketManager {
    private List<Ticket> soldTickets = new ArrayList<>();

    public void sellTicket(String name, TicketType type) {
        Ticket ticket = new Ticket(name, type);
        soldTickets.add(ticket);
    }

    public void printAllSales() {
        for (Ticket soldTicket : soldTickets) {
            System.out.println(soldTicket);
        }
    }

    public Map<TicketType, Long> countByType() {
        EnumMap<TicketType, Long> ticketTypeObjectEnumMap = new EnumMap<>(TicketType.class);
        for (Ticket soldTicket : soldTickets) {
            ticketTypeObjectEnumMap.put(soldTicket.getType(), ticketTypeObjectEnumMap.
                    getOrDefault(soldTicket.getType(), 0L) + 1);

        }
        return ticketTypeObjectEnumMap;
    }

    public int totalRevenue() {
        int totalMoney =0;
        for (Ticket soldTicket : soldTickets) {
            int price = soldTicket.getType().getPrice();
            totalMoney += price;
        }
        return totalMoney;
    }
    public Set<String> getVIPBuyers(){
        Set<String> name = new HashSet<>();
        for (Ticket soldTicket : soldTickets) {
            if (TicketType.VIP==soldTicket.getType());
            name.add(soldTicket.getBuyerName());
        }
        return name;
    }
}
