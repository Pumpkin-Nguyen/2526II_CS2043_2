public class IncrementTask implements Runnable {
    private final int INCREMENT_VALUE = 10000;
    private boolean withTryLock = false;
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    public IncrementTask(Counter counter, boolean withTryLock) {
        this.counter = counter;
        this.withTryLock = withTryLock;
    }

    @Override
    public void run() {
        for (int i = 0; i < INCREMENT_VALUE; i++) {
            if (withTryLock) {
                counter.incrementWithTryLock();
            } else {
                counter.increment();
            }
        }
    }
    
}
