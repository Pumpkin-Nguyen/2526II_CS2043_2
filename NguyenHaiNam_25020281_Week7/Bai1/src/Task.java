public class Task implements Runnable {
    private String name;
    private long durationMs;

    public Task(String name, long durationMs) {
        this.name = name;
        this.durationMs = durationMs;
    }

    @Override
    public void run() {
        System.out.printf("Start %s\n", name);
        
        try {
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            System.out.printf("Task %s interrupted!\n", name);
        }

        System.out.printf("End %s\n", name);
    }
}