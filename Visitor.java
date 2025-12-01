public class Visitor {
    protected static int visitorCount = 0;

    protected int id;
    protected NameInfo nameInfo;
    protected int age;

    public Visitor(int id, String name, int age) {
        this.id = id;
        this.nameInfo = new NameInfo(name);
        this.age = age;
        visitorCount++;
    }

    public static int getVisitorCount() {
        return visitorCount;
    }

    public void buyTicket(Ticket ticket) {
        System.out.println("Visitor.buyTicket()");
    }

    public void visitAttraction(Attraction attraction) {
        System.out.println("Visitor.visitAttraction()");
    }

    public static class NameInfo {
        String fullName;

        public NameInfo(String fullName) {
            this.fullName = fullName;
        }
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + nameInfo.fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
