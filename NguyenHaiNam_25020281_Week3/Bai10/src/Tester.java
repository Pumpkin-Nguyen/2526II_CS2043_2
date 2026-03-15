public class Tester extends Employee {
    private int bugsFound;
    public Tester(String name, double baseSalary, int bugsFound) {
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateBonus() {
        return this.getBaseSalary() * 0.1 + (this.bugsFound * 50_000);
    }
}
