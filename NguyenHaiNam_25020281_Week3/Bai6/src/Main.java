import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        Product[] order = new Product[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split("\"");

            String type = parts[0].trim();
            String name = parts[1];
            String[] data = parts[2].trim().split(" ");
            double price = Double.parseDouble(data[0]);

            if (type.equals("E")) {
                double warrantyExpense = Double.parseDouble(data[1]);

                order[i] = new Electronics(String.valueOf(i), name, price, warrantyExpense);
            } else if (type.equals("F")) {
                String expireDate = data[1];
                order[i] = new Food(String.valueOf(i), name, price, expireDate);
            }
        }
        
        System.out.println("---------------");

        double total = 0;
        System.out.println("---Orders---");
        for (Product product : order) {
            product.printDetails();
            total += product.getFinalPrice();
        }
        System.out.printf("Total = %.1f\n", total);

        scanner.close();
    }
}
