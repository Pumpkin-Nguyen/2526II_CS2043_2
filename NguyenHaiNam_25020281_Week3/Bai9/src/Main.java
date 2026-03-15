import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<IPayable> payableList = new ArrayList<IPayable>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];

            if (type.equals("S")) {
                String id = parts[1];
                String name = parts[2];
                int workingHours = Integer.parseInt(parts[3]);
                double hourlyRate = Double.parseDouble(parts[4]);

                payableList.add(new PartTimeStaff(id, name, workingHours, hourlyRate));
            } else if (type.equals("I")) {
                String itemName = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double pricePerItem = Double.parseDouble(parts[3]);

                payableList.add(new Invoice(itemName, quantity, pricePerItem));
            }
        }

        System.out.println("---------------");

        double total = 0;
        for (IPayable payable : payableList) {
            if (payable instanceof PartTimeStaff) {
                PartTimeStaff staff = (PartTimeStaff) payable;
                total += staff.getPaymentAmount();
                System.out.printf("PartTimeStaff %s - Payment: %.1f\n", staff.getName(), staff.getPaymentAmount());
            } else 
                if (payable instanceof Invoice) {
                Invoice invoice = (Invoice) payable;
                total += invoice.getPaymentAmount();
                System.out.printf("Invoice %s - Payment: %.1f\n", invoice.getItemName(), invoice.getPaymentAmount());
            }
        }
        System.out.printf("Total Payment = %.1f\n", total);
        
        scanner.close();
    }
}