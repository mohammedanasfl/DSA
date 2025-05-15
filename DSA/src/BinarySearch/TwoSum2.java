package BinarySearch;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int [] result=new int[]{-1,-1};
        int target=9;

        int left=0,right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(target==sum){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            if(target<sum){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
