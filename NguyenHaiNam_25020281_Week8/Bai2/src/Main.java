public class Main {
    public static void main(String[] args) {
        OldSalaryCalculator oldSalaryCalculator = new OldSalaryCalculator();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        String name = "Nam";
        double baseSalary = 300_000;
        int workDays = 26;
        int totalDays = 30;
        double taxRate = 0.1;
        double bonus = 2_500_000;

        System.out.println("--------OLD-------");
        oldSalaryCalculator.printPayroll(name, baseSalary, workDays, totalDays, taxRate, bonus);

        System.out.println("\n--------NEW-------");
        salaryCalculator.printPayroll(name, baseSalary, workDays, totalDays, taxRate, bonus);
    }
}