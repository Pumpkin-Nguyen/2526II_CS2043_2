import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new StandardOrder(2.0, 10.0));
        orders.add(new ExpressOrder(1.5, 5.0));
        orders.add(new FragileOrder(0.5, 20.0));
        orders.add(new BulkyOrder(10.0, 50.0));

        System.out.println("DANH SÁCH ĐƠN HÀNG:");
        for (Order order : orders) {
            System.out.printf("%s - Phí: %,.0f VNĐ%n", order.getLabel(), order.getDeliveryFee());
        }
    }
}
