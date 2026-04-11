public class Main {
    public static void main(String[] args) throws InterruptedException {
        BookStore store = new BookStore();

        store.addBook("Immune", 10);
        store.addBook("Algortithm", 5);

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    store.getStock("Immune");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }, "thread-read-" + i).start();
        }

        new Thread(() -> {
            try {
                store.addBook("Java", 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread-write-addBook").start();

        new Thread(() -> {
            try {
                store.borrow("Immune", 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "thread-write-borrow").start();

    }
}
