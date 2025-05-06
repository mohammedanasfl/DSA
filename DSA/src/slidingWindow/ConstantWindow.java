package slidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        int [] arr={-1,2,3,3,4,5,-1};
        int k=4;

        int maxSum=0;
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        int l=0,r=k;
        while(r< arr.length){
            sum-=arr[l];
            sum+=arr[r];
            maxSum=Math.max(sum,maxSum);
            l++;
            r++;
        }
        System.out.println(maxSum);

    }

}
