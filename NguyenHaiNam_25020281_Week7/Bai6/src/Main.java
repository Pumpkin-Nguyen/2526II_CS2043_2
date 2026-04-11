import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng mảng n: ");
        int n = scanner.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<SecondLargestTask> tasks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số phần tử mảng " + i + ": ");
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = scanner.nextInt();
            }
            tasks.add(new SecondLargestTask(i, arr));
        }

        List<Future<Integer>> futures = new ArrayList<>();
        for (SecondLargestTask task : tasks) {
            futures.add(executor.submit(task));
        }

        int sum = 0;
        System.out.println("-------------");
        for (int i = 0; i < futures.size(); i++) {
            try {
                Integer result = futures.get(i).get();

                if (result != null) {
                    System.out.printf("Array %d: second largest = %d\n", i, result);
                    sum += result;
                } else {
                    System.out.printf("Array %d: Not found\n", i);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum = " + sum);

        executor.shutdown();
        scanner.close();
    }
}
