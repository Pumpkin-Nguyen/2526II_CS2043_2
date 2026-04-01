import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Hỗ trợ khách hàng-----");

        CustomerQueue queue = new CustomerQueue();
        Customer customerA = new Customer("1", "Nguyễn Văn A");
        Customer customerB = new Customer("2", "Nguyễn Văn B");

        queue.add(customerA);
        queue.add(customerB);

        // Xu ly khach hang A

        Ticket ticket1 = new Ticket("1", "Hỗ trợ khách hàng A", LocalDate.now());
        System.out.println(ticket1);

        MessageHistory historyA = new MessageHistory();
        historyA.add(new Message("101", "Xin chào anh/chị " + customerA.getName()));
        historyA.add(new Message("102", "Em xin phép được hỗ trợ mình. Không biết mình đang gặp phải vấn đề gì ạ?"));
        historyA.add(new Message("103", "Thân ái"));

        historyA.undo();
        System.out.print("Tin nhắn cuối cùng: ");
        historyA.peek();

        System.out.println("Lịch sử chat:");
        historyA.print();

        queue.poll(customerA);
        System.out.println();
        // Xu ly khach hang B

        Ticket ticket2 = new Ticket("2", "Hỗ trợ khách hàng B", LocalDate.now());
        System.out.println(ticket2);

        MessageHistory historyB = new MessageHistory();
        historyB.add(new Message("101", "Xin chào anh/chị " + customerB.getName()));
        historyB.add(new Message("102", "Em xin phép được hỗ trợ mình. Không biết mình đang gặp phải vấn đề gì ạ?"));
        historyB.print();

        queue.poll(customerB);
    }
}
