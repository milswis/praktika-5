public class Employee {
    protected static int employeeCount = 0;

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected int experienceYears;

    public Employee(int id, String firstName, String lastName, String position, int experienceYears) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.experienceYears = experienceYears;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void work() {
        System.out.println("Employee.work()");
    }

    public void takeBreak() {
        System.out.println("Employee.takeBreak()");
    }

    public void maintainAttraction(Attraction attraction) {
        System.out.println("Employee.maintainAttraction()");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
