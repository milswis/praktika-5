public class Ticket {
    protected static int totalTickets = 0;

    protected int id;
    protected Visitor visitor;
    protected Attraction attraction;
    protected double price;
    protected String date;

    public Ticket(int id, Visitor visitor, Attraction attraction, double price, String date) {
        this.id = id;
        this.visitor = visitor;
        this.attraction = attraction;
        this.price = price;
        this.date = date;
        totalTickets++;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    public void useTicket() {
        System.out.println("Ticket.useTicket()");
    }

    public void refund() {
        System.out.println("Ticket.refund()");
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", visitor=" + visitor +
                ", attraction=" + attraction +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
