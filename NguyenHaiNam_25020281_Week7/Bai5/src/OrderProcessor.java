import java.util.concurrent.Callable;

public class OrderProcessor implements Callable<Boolean> {
    private String id;
    private long processMs;

    public OrderProcessor(String id, long processMs) {
        this.id = id;
        this.processMs = processMs;
    }

    @Override
    public Boolean call() {
        System.out.println("Start " + this.id);

        try {
            Thread.sleep(processMs);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
            e.printStackTrace();
        }

        return processMs <= 1500;
    }
}
