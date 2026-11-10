package control2;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket("Концерт", 1000),
                new Ticket("Концерт1", 80),
                new VipTicket("Концерт2", 5000, "1")
        };
        for (int i = 0; i < tickets.length; i++) {
            boolean success = tickets[i].discount(50);
            System.out.println("Скидка применена: " + success + " | Текущая цена: " + tickets[i].getPrice() + " | Билет: " + tickets[i]);
        }
    }
}