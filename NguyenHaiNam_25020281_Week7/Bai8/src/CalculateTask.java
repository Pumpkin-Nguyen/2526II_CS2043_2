import java.util.List;
import java.util.function.Function;

public class CalculateTask implements Function<List<Integer>, Long> {
    @Override
    public Long apply(List<Integer> primes) {
        int k = primes.size() % 2 == 0 ? 2 : 3;
        long sum = 0;
        for (int prime : primes) {
            sum += (long) Math.pow(prime, k);
        }
    
        return sum;
    }
}
