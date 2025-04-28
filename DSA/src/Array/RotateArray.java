package Array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=5;
        //right
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        //left
//        reverse(nums,0,k-1);
//        reverse(nums,k,n-1);
//        reverse(nums,0,n-1);


    }

    private static void reverse(int[] nums, int i, int j) {
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
