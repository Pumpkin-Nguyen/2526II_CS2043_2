public class Solution {
    public long fibonacci(long n) {
        if (n < 0) return -1;
        if (n <= 1) return n;

        if (n <= 100) return Long.MAX_VALUE;

        long f0 = 0, f1 = 1;
        for (int i = 2; i <= n; i++) {
            if (f1 > Long.MAX_VALUE - f0) return Long.MAX_VALUE;

            long temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }
        
        return f1;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fibonacci(4));
        System.out.println(sol.fibonacci(1));
        System.out.println(sol.fibonacci(79));
        System.out.println(sol.fibonacci(100));

    }
}