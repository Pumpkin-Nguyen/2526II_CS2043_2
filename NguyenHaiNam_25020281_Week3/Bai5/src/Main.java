import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split("\"");

            String type = parts[0].trim();
            String name = parts[1];
            String[] data = parts[2].trim().split(" ");

            if (type.equals("F")) {
                double baseSalary = Double.parseDouble(data[0]);
                double bonus = Double.parseDouble(data[1]);
                double penalty = Double.parseDouble(data[2]);
                employees[i] = new FullTimeEmployee(String.valueOf(i), name, null, baseSalary, bonus, penalty);                
            } else if (type.equals("P")) {
                double workingHours = Double.parseDouble(data[0]);
                double hourlyRate = Double.parseDouble(data[1]);
                employees[i] = new PartTimeEmployee(String.valueOf(i), name, null, workingHours, hourlyRate);
            }

        }
        
        System.out.println("---BẢNG LƯƠNG CHI TIẾT---");
        for (Employee employee : employees) {
            employee.printDetails();
        }
        scanner.close();
    }
}
