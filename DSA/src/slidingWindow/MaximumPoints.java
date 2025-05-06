package slidingWindow;

public class MaximumPoints {
    public static void main(String[] args) {
        int [] arr={6,2,3,4,7,2,1,7,1};
        int k=4;

        int leftSum=0,rightSum=0,maxSum=0;
        for(int i=0;i<k;i++) leftSum+=arr[i];
        maxSum=leftSum;

        int right=arr.length-1;

        for(int i=k-1;i>=0;i--){
            leftSum-=arr[i];
            rightSum+=arr[right--];
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }

        System.out.println(maxSum);
    }
}
