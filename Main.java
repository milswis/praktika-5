public class Main {
    public static void main(String[] args) {
        Park park = ObjectFactory.createPark(1, "Sunny Park", "Одеса", 2005);
        Attraction attraction = ObjectFactory.createAttraction(1, "Американські гірки", "Екстремальний", 20, true);
        Employee employee = ObjectFactory.createEmployee(1, "Наталья", "Ковальчук", "Оператор", 5);
        Visitor visitor = ObjectFactory.createVisitor(1, "Анна", 17);
        Ticket ticket = ObjectFactory.createTicket(1, visitor, attraction, 150.0, "2025-10-06");

        DataStorage.parks.add(park);
        DataStorage.attractions.add(attraction);
        DataStorage.employees.add(employee);
        DataStorage.visitors.add(visitor);
        DataStorage.tickets.add(ticket);

        System.out.println(park);
        System.out.println(attraction);
        System.out.println(employee);
        System.out.println(visitor);
        System.out.println(ticket);

        park.openPark();
        attraction.start();
        employee.work();
        visitor.visitAttraction(attraction);
        ticket.useTicket();

        DataStorage.printStats();
    }
}
