package challenge;

import java.util.Arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int [] nums={3,6,1,2,5};
        int k=2;
        Arrays.sort(nums);
        int count=1,firstNum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-firstNum>k){
                count++;
                firstNum=nums[i];
            }
        }
        System.out.println(count);
    }
}
