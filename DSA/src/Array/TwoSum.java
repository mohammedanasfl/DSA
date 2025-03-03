package Array;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i],i);
        }return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9));
    }
}
