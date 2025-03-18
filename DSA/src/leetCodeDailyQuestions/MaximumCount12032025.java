package leetCodeDailyQuestions;

public class MaximumCount12032025 {

    public static int maximumCount(int[] nums) {
        int negative=binarySearch(nums,0);
        int positive= nums.length-binarySearch(nums,1);
        return Math.max(negative,positive);

    }
    private static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }
}
