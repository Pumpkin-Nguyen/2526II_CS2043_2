public class Technician extends Employee {
    private int overtimeHours;

    public Technician(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public void work() {
        System.out.println("Lắp đặt thiết bị");
    }

    public double calculatePay() {
        return this.getBaseSalary() + this.overtimeHours * 20_000;
    }

}
