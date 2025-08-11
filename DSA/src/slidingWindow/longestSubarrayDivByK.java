package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayDivByK {
    public static void main(String[] args) {
        int [] nums={2,3,1,6,7};
        int k=6;

        Map<Integer,Integer>map =new HashMap<>();
        map.put(0,-1);

        int prefixSum=0,maxLen=0;
        for(int i=0;i< nums.length;i++){
            prefixSum+=nums[i];
            int mod=(prefixSum % k+k)% k;
            if(map.containsKey(mod)) maxLen=Math.max(maxLen,i-map.get(mod));
            else map.put(mod,i);
        }
        System.out.println(maxLen);
    }
}
