import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BookStore {
    private Map<String, Integer> stock = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public int getStock(String bookName) throws InterruptedException {
        lock.readLock().lock();
        try {
            int qty = stock.getOrDefault(bookName, 0);
            System.out.printf("(%s) (%s) Quantity of %s in stock: %d\n", LocalDateTime.now(), Thread.currentThread().getName(), bookName, qty);
            Thread.sleep(1000);
            return qty;
        } finally {
            lock.readLock().unlock();
        }
    }
    
    public void addBook(String title, int qty) throws InterruptedException {
        lock.writeLock().lock();
        try {
            stock.put(title, stock.getOrDefault(title, 0) + qty);
            System.out.printf("(%s) (%s) Added %s (quantity: %d) to stock\n", LocalDateTime.now(), Thread.currentThread().getName() , title, qty);
            Thread.sleep(1000);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void borrow(String title, int qty) throws InterruptedException {
        lock.writeLock().lock();
        try {
            int currentQty = stock.getOrDefault(title, 0);

            if (currentQty >= qty) {
                stock.put(title, currentQty - qty);
                System.out.printf("(%s) (%s) Borrowed %s (quantity: %d) from stock\n", 
                LocalDateTime.now(), Thread.currentThread().getName(), title, qty);
            Thread.sleep(1000);
            } else {
                System.out.println("(" + Thread.currentThread().getName() + ") Stock doesn't have enough quantity");
            }
        } finally {
            lock.writeLock().lock();
        }

    }
}
