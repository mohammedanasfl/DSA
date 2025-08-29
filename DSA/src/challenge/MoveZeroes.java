package challenge;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums={1,3,12,0,0};
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) nums[j++]=nums[i];
        }
        for(int i=j;i< nums.length;i++) nums[i]=0;
        System.out.println(Arrays.toString(nums));
    }
}
