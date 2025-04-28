package leetCodeDailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class GoodSubarraysCounter16042025 {
    public static void main(String[] args) {
        System.out.println(countGood(new int[]{3, 1, 4, 3, 2, 2, 4},2));
    }

    private static long countGood(int[] nums, int k) {
        Map<Integer,Integer>freq=new HashMap<>();
        int n=nums.length;
        int left =0;
        long count=0;
        long pairs=0;
        for(int right=0;right<n;right++){
            int val=nums[right];
            int currentFreq = freq.getOrDefault(val, 0);

            pairs += currentFreq;
            freq.put(val, currentFreq + 1);

            while (pairs >= k) {
                count += (n - right);


                int leftVal = nums[left];
                int freqLeft = freq.get(leftVal);

                pairs -= (freqLeft - 1);
                freq.put(leftVal, freqLeft - 1);
                left++;
            }
        }
        return count;
    }
}
