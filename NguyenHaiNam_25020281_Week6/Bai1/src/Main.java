public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            AppConfig config1 = AppConfig.getInstance();
            System.out.println("Thread 1 - Hashcode: " + config1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            AppConfig config2 = AppConfig.getInstance();
            System.out.println("Thread 1 - Hashcode: " + config2.hashCode());
        });

        thread1.start();
        thread2.start();
    }

}
