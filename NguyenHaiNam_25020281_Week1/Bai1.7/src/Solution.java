public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            res = res * 10 + temp;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(900));
        System.out.println(sol.reverse(-382));
        System.out.println(sol.reverse(0));
        System.out.println(sol.reverse(Integer.MAX_VALUE));
    }
}

