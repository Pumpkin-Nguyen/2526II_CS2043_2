public class Solution {
    public int sumOfDigits(int n) {
        if (n < 0)
            n = -n;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sumOfDigits(-19282));
        System.out.println(sol.sumOfDigits(0));
        System.out.println(sol.sumOfDigits(28184));
        System.out.println(sol.sumOfDigits(29238383));

    }
}

