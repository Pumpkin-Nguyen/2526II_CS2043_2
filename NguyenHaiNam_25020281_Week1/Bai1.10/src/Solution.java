public class Solution {

    public int secondLargest(int[] arr) {
        if (arr.length == 0)
            return -1;
        int max1 = Integer.MIN_VALUE;
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
        System.out.println(sol.secondLargest(new int[] { 12, 293, 392183, 2020, 213 }));
        System.out.println(sol.secondLargest(new int[] { 1 }));
        System.out.println(sol.secondLargest(new int[] { 1, 2, 3, 4, 4, 5, 5, 6 }));
    }
}
