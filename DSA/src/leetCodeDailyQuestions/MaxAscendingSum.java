package leetCodeDailyQuestions;

public class MaxAscendingSum {
    public static int maxAscendingSum(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                maxSum=Math.max(sum,maxSum);
                sum=nums[i];
            }
        }

        return Math.max(maxSum,sum);
    }
    public static void main(String []args){
        System.out.print(maxAscendingSum(new int[]{10,20,30,5,10,50}));
    }
}
