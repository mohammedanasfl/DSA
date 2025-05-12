package slidingWindow;

public class NumberOfSubarrays {
    public static void main(String[] args) {
        int [] arr={1,1,2,1,1};
        int k=3;

        int left=0,right=0,maxCount=0,sum=0;
        while(right<arr.length){
            sum+=(arr[right]%2);

            while(sum >k){
                sum-=(arr[left]%2);
                left++;
            }
            maxCount=Math.max(maxCount,right-left+1);
            right++;
        }
        System.out.println(maxCount);
    }
}
