public class Worker implements Runnable {
    /* 
    Keyword volatile giúp tránh trường hợp thread không bao giờ dừng
    Các nguyên nhân là do:
     1 . Thread worker khi được tạo có thể sẽ lưu bản sao của biến running vào 1 vùng cache riêng
    thay vì bộ nhớ chính của Thread Main. Vì vậy, khi hàm stop làm thay đổi giá trị của running,
    thread Worker vẫn đang đọc giá trị cũ dẫn đến vòng while không bao giờ dừng.
     2. Compiler của Java có thể sẽ tối ưu hoá code while(running) thành if (running) { while(true) ...}
    do không thấy biến running bị thay đổi tại thread đó.

    Vì vậy, cần keyword volatile để đảm bảo: Thread Worker đọc/ghi trực tiếp biến running trong 
    bộ nhớ chính. Đảm bảo mọi sự thay đổi được đọc ngay lập tức, code cũng sẽ không bị tối ưu bởi
    compiler.
    */
    private volatile boolean running = true;

    public Worker() {}

    public void stop() {
        this.running = false;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("Working...");
        }
    }
}
