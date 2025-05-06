package slidingWindow;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int [] arr={2,5,1,7,10} ;
        int k=14;

        int maxLen=0;
//        for(int i=0;i< arr.length;i++){
//            int sum=0;
//            for(int j=i;j< arr.length;j++){
//                sum+=arr[j];
//                if(sum<=k){
//                    maxLen=Math.max(maxLen,j-i+1);
//                }
//                else {
//                    break;
//                }
//            }
//        }
        int l=0,r=0,sum=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        System.out.println(maxLen);
    }
}
