import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PrimeFilterTask implements Function<List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> nums) {
        List<Integer> primes = new ArrayList<>();
        
        for (int num : nums) {
            if (checkPrime(num)) primes.add(num);
        }

        System.out.println("Stage 1 - Array ");
        return primes;
    }
    
    private boolean checkPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
