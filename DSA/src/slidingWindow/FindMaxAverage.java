package slidingWindow;

public class FindMaxAverage {
    public static void main(String[] args) {
        int [] arr={1,12,-5,-6,50,3};
        int k=4;
        int maxSum=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=sum;
        int left=0,right=k;
        while(right< arr.length){
            sum-=arr[left];
            sum+=arr[right];
            maxSum=Math.max(maxSum,sum);
            left++;
            right++;
        }
        System.out.println((double)maxSum/k);
    }
}
