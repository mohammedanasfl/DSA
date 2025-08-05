package leetCodeDailyQuestions;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarray {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
    public static int maximumUniqueSubarray(int[] nums) {

        Set<Integer>set=new HashSet<>();

        int right=0,left=0;

        int sum=0,maxSum=0;
        while(right <nums.length){

            if(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            else {
                set.add(nums[right]);
                sum+=nums[right];
                maxSum=Math.max(maxSum,sum);
                right++;

            }


        }
        return maxSum;

    }
}
