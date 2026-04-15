public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        t1.start();
        try {
            Thread.sleep(1000);

            System.out.println("Stopping the worker...");
            worker.stop();
            
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
            e.printStackTrace();
        }

        System.out.println("Task done!");
    }
}
