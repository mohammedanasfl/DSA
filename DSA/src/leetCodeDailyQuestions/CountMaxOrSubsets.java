package leetCodeDailyQuestions;

public class CountMaxOrSubsets {
    static int maxOr=0;
    static int count=0;
    public static void main(String[] args) {

        System.out.println(countMaxOrSubsets(new int[]{3,2,1,5}));
        }
    public static int countMaxOrSubsets(int[] nums) {
        // Step 1: Calculate the maximum OR possible
        for (int num : nums) {
            maxOr |= num;
        }

        // Step 2: Start backtracking from index 0 and OR = 0
        backtrack(nums, 0, 0);
        return count;
    }

    private static void backtrack(int[] nums, int index, int currentOr) {
        // Base case: if we've reached the end of the array
        if (index == nums.length) {
            if (currentOr == maxOr) {
                count++;
            }
            return;
        }

        // Include current element
        backtrack(nums, index + 1, currentOr | nums[index]);

        // Exclude current element
        backtrack(nums, index + 1, currentOr);
    }


}


