import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    public static List<Attraction> attractions = new ArrayList<>();
    public static List<Employee> employees = new ArrayList<>();
    public static List<Visitor> visitors = new ArrayList<>();
    public static List<Ticket> tickets = new ArrayList<>();
    public static List<Park> parks = new ArrayList<>();

    public static void printStats() {
        System.out.println("Attractions: " + Attraction.getTotalAttractions());
        System.out.println("Employees: " + Employee.getEmployeeCount());
        System.out.println("Visitors: " + Visitor.getVisitorCount());
        System.out.println("Tickets: " + Ticket.getTotalTickets());
        System.out.println("Parks: " + Park.getTotalParks());
    }
}
