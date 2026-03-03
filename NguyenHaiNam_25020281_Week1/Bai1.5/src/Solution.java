public class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.gcd(0, 0));
        System.out.println(sol.gcd(25, 90));
        System.out.println(sol.gcd(-3, 23));

    }
}