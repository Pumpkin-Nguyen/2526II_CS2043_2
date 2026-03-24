import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String type = parts[0].trim();
            String id = parts[1];
            String name = parts[2];
            double baseSalary = Double.parseDouble(parts[3]);

            if (type.equals("O")) {
                employees.add(new OfficeWorker(id, name, baseSalary));
            } else if (type.equals("T")) {
                int overtimeHours = Integer.parseInt(parts[4]);
                employees.add(new Technician(id, name, baseSalary, overtimeHours));
            }
        }

        double totalPay = 0;

        for (Employee employee : employees) {
            double salary = employee.calculatePay();
            System.out.printf("%s - Pay: %.1f\n", employee.getName(), salary);
            totalPay += salary;
            employee.work();
            System.out.println();
        }

        System.out.printf("Total Pay = %.1f", totalPay);

        scanner.close();
    }
}
