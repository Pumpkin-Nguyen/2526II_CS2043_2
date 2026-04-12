import java.util.concurrent.Callable;

public class PrimeCountTask implements Callable<Integer> {

    private int[] nums;

    public PrimeCountTask(int[] nums) {
        this.nums = nums;
    }

    @Override
    public Integer call()  {
        int count = 0;

        for (int num : nums) {
            if (checkPrime(num)) count += 1;
        }

        return count;
    }

    private boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}
