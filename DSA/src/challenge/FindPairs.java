package challenge;

import java.util.*;

public class FindPairs {
    public static void main(String[] args) {
        int [] nums={3,1,4,1,5};
        int k=2;

        Arrays.sort(nums);  // sort array first
        int left=0,right=1;
        Set<List<Integer>> set=new HashSet<>();

        while(right < nums.length){
            int diff = nums[right] - nums[left];

            if(diff == k && left != right){
                set.add(Arrays.asList(nums[left], nums[right]));
                left++;
                right++;
            }
            else if(diff < k){
                right++;
            }
            else{
                left++;
                if(left == right) right++;
            }
        }
        System.out.println(set.size());
    }
}
