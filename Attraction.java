public class Attraction {
    protected static int totalAttractions = 0;

    protected int id;
    protected String name;
    protected String type;
    protected int capacity;
    protected boolean isWorking;

    public Attraction(int id, String name, String type, int capacity, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.isWorking = isWorking;
        totalAttractions++;
    }

    public static int getTotalAttractions() {
        return totalAttractions;
    }

    public void start() {
        System.out.println("Attraction.start()");
    }

    public void stop() {
        System.out.println("Attraction.stop()");
    }

    public void repair() {
        System.out.println("Attraction.repair()");
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", isWorking=" + isWorking +
                '}';
    }
}
