package Array;

import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int [] result=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[pos]=nums[i];
                pos+=2;
            }
            else {
                result[neg]=nums[i];
                neg+=2;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));
    }
}
