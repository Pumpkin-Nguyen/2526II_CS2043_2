public class Main {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Primary account", 150);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                bank1.deposit(100);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                bank1.withdraw(100);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            e.printStackTrace();
        }

        System.out.println("Final balance: " + bank1.getBalance());
    }
}
