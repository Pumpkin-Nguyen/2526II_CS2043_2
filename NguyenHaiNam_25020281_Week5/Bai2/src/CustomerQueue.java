import java.util.LinkedList;

public class CustomerQueue {
    private LinkedList<Customer> customerQueue;

    public CustomerQueue() {
        this.customerQueue = new LinkedList<>();
    }

    public void add(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Đã thêm khách hàng " + customer.getName() + " vào danh sách.");
    }

    public void poll(Customer customer) {
        if (customerQueue.size() > 0) {
            customerQueue.poll();
            System.out.println("Đã xóa khách hàng " + customer.getName() + " khỏi danh sách.");
        } else {
            System.out.println("Không còn khách đợi");
        }
    }

}
