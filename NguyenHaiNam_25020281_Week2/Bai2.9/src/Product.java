import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private double discount;

    private static double taxRate = 0.1;
    private static double totalRevenue = 0;

    public Product(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public static void updateTaxRate(double newRate) {
        taxRate = newRate;
    }

    public double calculateFinalPrice() {
        return (price - discount) * (1 + taxRate);
    }

    public void updateDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            double total = amount * this.calculateFinalPrice();
            totalRevenue += total;
            System.out.printf("Đã bán thành công %d %s trị giá %.2f$\n", amount, this.name, total);
        } else {
            System.err.println("Không đủ hàng trong kho.");
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static void printLastPrice(Product p1, Product p2) {
        System.out.printf("Giá cuối cùng của sản phẩm 1: %.2f$\n", p1.calculateFinalPrice());
        System.out.printf("Giá cuối cùng của sản phẩm 2: %.2f$\n", p2.calculateFinalPrice());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Product 1
        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Giá: ");
        double price = scanner.nextDouble();
        System.out.print("Số lượng: ");
        int quantity = scanner.nextInt();
        System.out.print("Giảm giá: ");
        double discount = scanner.nextDouble();
        scanner.nextLine();


        Product p1 = new Product(name, price, quantity, discount);

        // Product 2
        System.out.println("Nhập thông tin sản phẩm 2:");
        System.out.print("Tên: ");
        name = scanner.nextLine();
        System.out.print("Giá: ");
        price = scanner.nextDouble();
        System.out.print("Số lượng: ");
        quantity = scanner.nextInt();
        System.out.print("Giảm giá: ");
        discount = scanner.nextDouble();
        scanner.nextLine();

        Product p2 = new Product(name, price, quantity, discount);
        System.out.println("------------------------");

        // Amount for sell
        System.out.print("Số lượng sản phẩm 1 cần mua: ");
        int amount1 = scanner.nextInt();
        System.out.print("Số lượng sản phẩm 2 cần mua: ");
        int amount2 = scanner.nextInt();
        scanner.nextLine();

        p1.sell(amount1);
        p2.sell(amount2);
        System.out.println("------------------------");

        // Check for static
        Product.printLastPrice(p1, p2);

        Product.updateTaxRate(0.08);
        System.out.println("---Sau giảm thuế---");
        Product.printLastPrice(p1, p2);
        
        p1.updateDiscount(10.0);
        System.out.println("---Sau giảm giá sản phẩm 1---");
        Product.printLastPrice(p1, p2);

        System.out.println("Tổng doanh thu: " + Product.getTotalRevenue() + "$");

        scanner.close();
    }
}