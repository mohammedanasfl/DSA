package slidingWindow;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {

        int left=0;
        int right=0;
        int maxLen=0;
        int sum=0;

        while(right<nums.length){
            sum+=nums[right];
            right++;
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, right - left);
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 8;
        System.out.println(longestSubarray(nums, k)); // Expected: 5
    }
}

