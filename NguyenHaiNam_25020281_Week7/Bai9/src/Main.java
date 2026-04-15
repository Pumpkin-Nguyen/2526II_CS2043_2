public class Main {
    private static final int THREAD_NUMS = 4;
    private static final boolean withTryLock = true;
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread[] threads = new Thread[THREAD_NUMS];

        for (int i = 0; i < THREAD_NUMS; i++) {
            threads[i] = new Thread(new IncrementTask(counter, withTryLock), "Thread-" + i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(thread.getName() + " interrupted.");
                e.printStackTrace();
            }
        }
        
        System.out.println("Final result of counter: " + counter.getValue());
    }
    
}