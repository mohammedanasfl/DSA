package Array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> result=new HashSet<>();
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    if((nums[i]+nums[j]+nums[k])==0){
//                       List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
//                        Collections.sort(triplet);
//                        result.add(triplet);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(result);

        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right= nums.length-1;

            while(left< right){
                int total=nums[i]+nums[left]+nums[right];

                if(total >0){
                    right--;
                }
                else if(total <0){
                    left++;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    while(nums[left]==nums[left-1] && left < right) left++;
                }
            }
        }
        return result;

    }
}
