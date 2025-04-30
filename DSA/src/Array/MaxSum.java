package Array;

public class MaxSum {
    public static void main(String[] args) {
        System.out.println(maxSum(new int []{1, 4, 2, 10, 23, 3, 1, 0, 20},4));
    }

    private static int  maxSum(int[] arr, int k) {
        int maxSum=0;
        for(int i=0;i<arr.length-k+1;i++){
            int currentSum=0;
            for(int j=0;j<k;j++){
                currentSum+=arr[i+j];
            }
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
