public class ObjectFactory {
    public static Attraction createAttraction(int id, String name, String type, int cap, boolean work) {
        return new Attraction(id, name, type, cap, work);
    }

    public static Employee createEmployee(int id, String fn, String ln, String pos, int exp) {
        return new Employee(id, fn, ln, pos, exp);
    }

    public static Visitor createVisitor(int id, String name, int age) {
        return new Visitor(id, name, age);
    }

    public static Ticket createTicket(int id, Visitor v, Attraction a, double p, String d) {
        return new Ticket(id, v, a, p, d);
    }

    public static Park createPark(int id, String name, String loc, int y) {
        return new Park(id, name, loc, y);
    }
}
