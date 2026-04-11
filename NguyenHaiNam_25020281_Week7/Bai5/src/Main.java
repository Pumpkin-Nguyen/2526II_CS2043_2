import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập m: ");
        int m = Integer.parseInt(scanner.nextLine().trim());

        Map<String, Long> orders = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            System.out.printf("Nhập Id và thời gian xử lý đơn hàng %d (phân cách bằng dấu cách): ", i);
            String[] parts = scanner.nextLine().split(" ");
            String id = parts[0];
            long processMs = Long.parseLong(parts[1]);

            orders.put(id, processMs);
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<String> logs = new ArrayList<>();
        Map<String, Future<Boolean>> futures = new HashMap<>();
        AtomicInteger successCount = new AtomicInteger(0);

        for (Entry<String, Long> entry : orders.entrySet()) {
            futures.put(entry.getKey(), executor.submit(new OrderProcessor(entry.getKey(), entry.getValue())));
        }

        for (Entry<String, Future<Boolean>> entry : futures.entrySet()) {
            try {
                Boolean result = entry.getValue().get();

                if (result) successCount.incrementAndGet();

                synchronized (logs) {
                    logs.add("%s %s".formatted(result ? "DONE" : "FAIL", entry.getKey()));
                }
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Interrupted!");
                e.printStackTrace();
            }
        }

        System.out.println("Success = " + successCount);
        System.out.println("---ORDER LOGS---");

        logs.stream().forEach(System.out::println);

        executor.shutdown();
        scanner.close();
    }
}
