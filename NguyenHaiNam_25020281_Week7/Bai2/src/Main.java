import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> nums = new ArrayList<>();

        System.out.print("Nhập các số nguyên (phân tách bằng dấu cách): ");
        String[] parts = scanner.nextLine().trim().split(" ");
        for (String part : parts) {
            nums.add(Integer.parseInt(part));
        }

        System.out.print("Nhập k: ");
        int k = Integer.valueOf(scanner.nextLine().trim());

        int size = (int) Math.ceil((double) n / k);
        ExecutorService executor = Executors.newFixedThreadPool(k);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int start = i * size;
            int end = Math.min(start + size, n);

            if (start < n) {
                Callable<Integer> task = new SumTask(nums, start, end);
                futures.add(executor.submit(task));
            }
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Thread interrupted!");
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + totalSum);

        executor.shutdown();
        scanner.close(); 
    }
}
