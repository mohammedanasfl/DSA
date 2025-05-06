package SDE_1;

public class MaxSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{2, 3, -8, 7, -1, 2, 3}));
        System.out.println(maxSubArraySum(new int[]{2, 3, -8, 7, -1, 2, 3}));

    }

    //normal approach
    static int maxSubarraySum(int [] arr){
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(currentSum,maxSum);
            }
        }
        return maxSum;

    }
    static  int maxSubArraySum(int [] arr){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }

}
