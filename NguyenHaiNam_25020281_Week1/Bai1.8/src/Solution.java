public class Solution {
    public boolean isPalindrome(int x) {
        int new_x = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            if (new_x > Integer.MAX_VALUE) return false;
            new_x = new_x * 10 + temp;
        }
        return new_x == x;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(122));
        System.out.println(sol.isPalindrome(-122221));
        System.out.println(sol.isPalindrome(300));
        System.out.println(sol.isPalindrome(99999999));

    }
}

