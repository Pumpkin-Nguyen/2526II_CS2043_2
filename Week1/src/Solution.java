public class Solution {
    public long fibonacci(long n) {
        if (n < 0) return -1;
        if (n <= 1) return n;

        long f0 = 0, f1 = 1;
        for (int i = 2; i <= n; i++) {
            if (f1 > Long.MAX_VALUE - f0) return Long.MAX_VALUE;

            long temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }
        return f1;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE) return 0;
            res = res * 10 + temp;
        }
        return res;
    }

    public boolean isPalindrome(int x) {
        return x == reverse(x);
    }

    public int sumOfDigits(int n) {
        if (n < 0) n = -n;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int secondLargest(int[] arr) {
        if (arr.length == 0) return -1;
        int max1 =  Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x < max1) {
                max2 = x;
            }
        }
        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fibonacci(96));
        System.out.println(sol.gcd(0, 0));
//        System.out.println(sol.isPrime(Integer.MAX_VALUE));
        System.out.println(sol.reverse(900));
        System.out.println(sol.reverse(-382));
        System.out.println(sol.reverse(0));
        System.out.println(sol.isPalindrome(122));
        System.out.println(sol.sumOfDigits(-19282));
        System.out.println(sol.secondLargest(new int[] {1,2,3,4,4,5,5,6}));
        System.out.println(sol.secondLargest(new int[] {1}));
    }
}

