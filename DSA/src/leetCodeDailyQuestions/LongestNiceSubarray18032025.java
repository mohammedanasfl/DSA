package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.List;

public class LongestNiceSubarray18032025 {
    public static int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLength = 1;
        int left = 0;
        int usedBits = 0;

        for (int right = 0; right < n; right++) {
            while ((usedBits & nums[right]) != 0) {
                usedBits ^= nums[left];
                left++;
            }

            usedBits |= nums[right];
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestNiceSubarray(new int[]{1,3,8,48,10}));

        System.out.println(longestNiceSubarray(new int[]{45106826,547958667,823366125,332020148,611677524,510346561,555831456,436600904,12594192,127206768,540754485,201997978,473116514,233000361,538246458,729745279,343417143,892046691,376031730}));
    }
}
