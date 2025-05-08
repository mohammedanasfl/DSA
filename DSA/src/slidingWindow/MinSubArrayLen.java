package slidingWindow;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int [] nums={2,3,1,2,4,3};
        int target=7;

        int minLength=Integer.MAX_VALUE;
        int left=0,right=0;
        int sum=0;

        while(right< nums.length){
            sum+=nums[right];

            while(sum>target){
                sum-=nums[left];
                left++;
            }
            if(sum==target) minLength=Math.min(minLength,right-left+1);
            right++;

        }
        System.out.println(minLength);
    }
}
