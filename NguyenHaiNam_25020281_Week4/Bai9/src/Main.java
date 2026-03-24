import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        StorageHub<Food> foodStorage = new StorageHub<>("Thực phẩm");
        StorageHub<Electronic> electronicStorage = new StorageHub<>("Điện tử");

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String type = parts[0];
            String id = parts[1];
            String name = parts[2];
            if (type.equals("F")) {
                LocalDate expireDate = LocalDate.parse(parts[3]);
                foodStorage.addProduct(new Food(id, name, expireDate));
            } else if (type.equals("E")) {
                int warrantyMonths = Integer.parseInt(parts[3]);
                electronicStorage.addProduct(new Electronic(id, name, warrantyMonths));
            }
        }

        scanner.close();

        foodStorage.check();
        System.out.println();
        electronicStorage.check();
    }
}
