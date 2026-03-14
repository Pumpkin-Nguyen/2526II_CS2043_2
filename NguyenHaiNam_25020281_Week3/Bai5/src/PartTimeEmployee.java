public class PartTimeEmployee extends Employee {
    private double workingHours, hourlyRate;

    public PartTimeEmployee(String id, String name, String birthday, double workingHours, double hourlyRate) {
        super(id, name, birthday);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double countTotalSalary() {
        return this.workingHours * this.hourlyRate;
    }

    @Override
    public void printDetails() {
        System.out.printf("%s - Part-time - %.1f\n", this.getName(), this.countTotalSalary());
    }
}
