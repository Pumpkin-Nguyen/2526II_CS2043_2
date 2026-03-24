public class OfficeWorker extends Employee {
    public OfficeWorker(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }
    public void work() {
        System.out.println("Soạn thảo văn bản");
    }
    public double calculatePay() {
        return this.getBaseSalary();
    }
}
