import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final ReentrantLock lock = new ReentrantLock();
    private int value;

    public void increment() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
    }

    public void incrementWithTryLock() {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    value++;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " cannot lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
            e.printStackTrace();
        }
    }

    public int getValue() {
        return value;
    }
}
