public class Park {
    protected static int totalParks = 0;

    protected int id;
    protected String name;
    protected String location;
    protected int foundedYear;

    public Park(int id, String name, String location, int foundedYear) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
        totalParks++;
    }

    public static int getTotalParks() {
        return totalParks;
    }

    public void openPark() {
        System.out.println("Park.openPark()");
    }

    public void closePark() {
        System.out.println("Park.closePark()");
    }

    public void addAttraction(Attraction attraction) {
        System.out.println("Park.addAttraction()");
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", foundedYear=" + foundedYear +
                '}';
    }
}
