import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    private static List<List<Integer>> allArrays = new ArrayList<>();
    private static int arraySize;

    public static void main(String[] args) {
        input();
        process();

    }

    public static void process() {
        ExecutorService pool1 = Executors.newFixedThreadPool(arraySize);
        ExecutorService pool2 = Executors.newFixedThreadPool(arraySize);
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        AtomicLong totalSum = new AtomicLong(0);

        for (int i = 0; i < allArrays.size(); i++) {
            final int arrayIndex = i;
            List<Integer> arr = allArrays.get(i);

            CompletableFuture<Void> future = CompletableFuture
                    .supplyAsync(() -> {
                        List<Integer> primes = new PrimeFilterTask().apply(arr);
                        System.out.println("Stage 1 - Array " + arrayIndex + ": " + primes);

                        return primes;
                    }, pool1)
                    .thenApplyAsync((primes) -> {
                        long result = new CalculateTask().apply(primes);
                        String type = primes.size() % 2 == 0 ? "squares" : "cubes";
                        System.out.println("Stage 2 - Array " + arrayIndex + ": sum of " + type + " = " + result);

                        return result;
                    }, pool2)
                    .thenAccept(result -> {
                        totalSum.addAndGet(result);
                    });
            futures.add(future);
        }

        CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new)).join();

        System.out.println("Total = " + totalSum.get());

        pool1.shutdown();
        pool2.shutdown();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng mảng n: ");
        arraySize = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Nhập mảng (số phần tử đứng đầu tiên) " + i + ": ");
            int m = scanner.nextInt();
            List<Integer> currentArray = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                currentArray.add(scanner.nextInt());
            }
            allArrays.add(currentArray);
        }
        scanner.close();
    }
}
