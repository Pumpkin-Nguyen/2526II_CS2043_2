import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    private static List<PrimeCountTask> tasks = new ArrayList<>();
    public static void main(String[] args) {
        inputTasks();

        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());

        List<Future<Integer>> futures = new ArrayList<>();
        for (PrimeCountTask task : tasks) {
            futures.add(executor.submit(task));
        }
    
        int maxCount = Integer.MIN_VALUE;
        List<Integer> mostPrimeList = new ArrayList<>();
        for (int i = 0; i < futures.size(); i++) {
            try {
                Integer primeCount = futures.get(i).get();

                System.out.printf("Array %d: %d\n", i, primeCount);
                if (maxCount < primeCount) {
                    maxCount = primeCount;
                    mostPrimeList.clear();
                    mostPrimeList.add(i);
                } else
                    if (maxCount == primeCount) {
                        mostPrimeList.add(i);
                    }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        for (int index : mostPrimeList) {
            System.out.printf("Most primes: Array %d with %d primes\n", index, maxCount);
        }

        executor.shutdown();
    }

    public static void inputTasks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng mảng n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mảng (số phần tử đứng đầu tiên) " + i + ": ");
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = scanner.nextInt();
            }
            tasks.add(new PrimeCountTask(arr));
        }
        scanner.close();
    }
}
