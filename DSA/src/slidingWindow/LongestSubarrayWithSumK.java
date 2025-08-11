package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(maxSubArrayLen(nums, k));  // Output: 4
    }

//    public static int maxSubArrayLen(int[] nums, int k) {
//        // Your optimized logic here
//        int maxSub=0;
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            int sum=0;
//            for(int j=i;j< nums.length;j++){
//                sum+=nums[j];
//                if(sum==k){
//                    maxSub=Math.max(count,j-i+1);                }
//            }
//
//        }
//        return maxSub;
//    }

    public static int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        // Important: store prefixSum 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (map.containsKey(prefixSum - k)) {
                int prevIndex = map.get(prefixSum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Only put prefixSum if it's not already present (we want the earliest index)
            map.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }

}

