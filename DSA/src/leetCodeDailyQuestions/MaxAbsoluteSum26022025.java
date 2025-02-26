package leetCodeDailyQuestions;

public class MaxAbsoluteSum26022025 {
    public static void main(String[] args) {
        System.out.println(maxAbsoluteSum(new int[]{1,-3,2,3,-4}));
    }
    public static int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0, currMax = 0, currMin = 0;

        for (int num : nums) {
            currMax = Math.max(0, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(0, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
