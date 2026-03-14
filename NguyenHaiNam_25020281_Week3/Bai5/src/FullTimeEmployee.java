public class FullTimeEmployee extends Employee {
    private double baseSalary, bonus, penalty;

    public FullTimeEmployee(String id, String name, String birthday, double baseSalary, double bonus, double penalty) {
        super(id, name, birthday);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    @Override
    public double countTotalSalary() {
        return this.baseSalary + (this.bonus - this.penalty);
    }

    @Override
    public void printDetails() {
        System.out.printf("%s - Full-time - %.1f\n", this.getName(), this.countTotalSalary());
    }
}
