import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];
            double baseSalary = Double.parseDouble(parts[2]);

            if (type.equals("E")) {
                employees.add(new Employee(name, baseSalary));
            } 
            else if (type.equals("D")) {
                int overtimeHours = Integer.parseInt(parts[3]);
                employees.add(new Developer(name, baseSalary, overtimeHours));
            }
            else if (type.equals("T")) {
                int bugsFound = Integer.parseInt(parts[3]);
                employees.add(new Tester(name, baseSalary, bugsFound));
            }          
        }

        System.out.println("---------------");

        for (Employee employee : employees) {
            double bonus = employee.calculateBonus();
            System.out.printf("%s - Bonus: %.1f\n", employee.getName(), bonus);

            if (employee instanceof Developer) {
                System.out.println("Tặng khóa học AWS");
            }
            else if (employee instanceof Tester) {
                System.out.println("Tặng tool Test");
            }

            System.out.println();
        }


        scanner.close();
    }
}
