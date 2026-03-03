public class Solution {
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


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(122));
        System.out.println(sol.isPalindrome(-122221));
        System.out.println(sol.isPalindrome(300));
        System.out.println(sol.isPalindrome(99999999));

    }
}

