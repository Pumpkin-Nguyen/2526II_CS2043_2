public abstract class Employee implements IWorkable {
    private String id, name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public String getName() {
        return this.name;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }

    public abstract double calculatePay();
}
