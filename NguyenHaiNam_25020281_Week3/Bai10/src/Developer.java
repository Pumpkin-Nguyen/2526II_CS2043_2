public class Developer extends Employee {
    private int overtimeHours;

    public Developer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateBonus() {
        return this.getBaseSalary() * 0.1 + (this.overtimeHours * 200_000);
    }
}