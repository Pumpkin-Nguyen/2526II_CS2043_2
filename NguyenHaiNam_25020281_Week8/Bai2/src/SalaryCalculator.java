public class SalaryCalculator {
    private static const double HEALTH_INSURANCE_RATE = 0.08;
    private static const double UNEMPLOYMENT_INSURANCE_RATE = 0.015;

    private static const double MINIMUM_TAXABLE_INCOME = 11_000_000;

    private static const double TIER_1_MAX_TAXABLE_INCOME = 5_000_000;
    private static const double TIER_1_TAX_RATE = 0.05;

    private static const double TIER_2_MAX_TAXABLE_INCOME = 10_000_000;
    private static const double TIER_2_TAX_RATE = 0.1;
    private static const double TIER_2_TAX_MINIMUM = 250_000;

    private static const double TIER_3_TAX_MINIMUM = 750_000;

    public void printPayroll(String name, double baseSalary,
                         int workDays, int totalDays,
                         double tier3TaxRate, double bonus) {
    System.out.println("=== BẢNG LƯƠNG ===");
    System.out.println("Nhân viên: " + name);

    double actualSalary = actualSalaryCalculate(baseSalary, workDays, totalDays);

    double insurance = insuranceCalculate(actualSalary);

    double tax = taxCalculate(actualSalary, insurance, tier3TaxRate);

    double netSalary = netSalaryCalculate(actualSalary, insurance, tax, bonus);

    System.out.println("Lương cơ bản: " + baseSalary);
    System.out.println("Ngày công: " + workDays + "/" + totalDays);
    System.out.println("Lương thực tế: " + actualSalary);
    System.out.println("Bảo hiểm: " + insurance);
    System.out.println("Thuế TNCN: " + tax);
    System.out.println("Thưởng: " + bonus);
    System.out.println("Thực nhận: " + netSalary);
}

    private double actualSalaryCalculate(double baseSalary, int workDays, int totalDays) {
        return baseSalary * workDays / totalDays;
    }

    private double insuranceCalculate(double actualSalary) {
        double healthInsurance = actualSalary * HEALTH_INSURANCE_RATE;
        double unemploymentInsurance = actualSalary * UNEMPLOYMENT_INSURANCE_RATE;
        return healthInsurance + unemploymentInsurance;
    }

    private double taxCalculate(double actualSalary, double insurance, double tier3TaxRate) {
        double taxableIncome = actualSalary - insurance - MINIMUM_TAXABLE_INCOME;
        double tax = 0;

        if (taxableIncome > 0) {
            if (taxableIncome <= TIER_1_MAX_TAXABLE_INCOME) tax = taxableIncome * TIER_1_TAX_RATE;
            else if (taxableIncome <= TIER_2_MAX_TAXABLE_INCOME) tax = TIER_2_TAX_MINIMUM + (taxableIncome - TIER_1_MAX_TAXABLE_INCOME) * TIER_2_TAX_RATE;
            else tax = TIER_3_TAX_MINIMUM + (taxableIncome - TIER_2_MAX_TAXABLE_INCOME) * tier3TaxRate;
        }

        return tax;
    }

    private double netSalaryCalculate(double actualSalary, double insurance, double tax, double bonus) {
        return actualSalary - insurance - tax + bonus;
    }
}