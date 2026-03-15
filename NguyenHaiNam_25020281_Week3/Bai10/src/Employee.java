public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public double calculateBonus() {
        return 0.1 * baseSalary;
    }
}
