package recursion;

public class FindTargetSumWays {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println("Number of expressions: " + findTargetSumWays(nums, target));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return countWays(nums, target, 0, 0);
    }

    private static int countWays(int[] nums, int target, int index, int sum) {

        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        int add = countWays(nums, target, index + 1, sum + nums[index]);
        int subtract = countWays(nums, target, index + 1, sum - nums[index]);

        return add + subtract;
    }
}
