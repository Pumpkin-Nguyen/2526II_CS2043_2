import java.util.concurrent.Callable;

public class SecondLargestTask implements Callable<Integer> {
    private int[] nums;

    public SecondLargestTask(int[] nums) {
        this.nums = nums;
    }

    @Override
    public Integer call() throws Exception {
        if (nums == null || nums.length < 2) return null;

        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num > maxValue) {
                secondMaxValue = maxValue;
                maxValue = num;
            } else if (maxValue > num && num > secondMaxValue) {
                secondMaxValue = num;
            }
        }

        if (secondMaxValue == Integer.MIN_VALUE) return null;

        return secondMaxValue;
    }
}
