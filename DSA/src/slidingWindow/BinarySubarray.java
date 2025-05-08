package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarray {
    public static void main(String[] args) {
        int [] nums={1,0,1,0,1};
        int goal=2;

        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
       int count=0,sum=0;
       for(int i:nums){
           sum+=i;
           count+=map.getOrDefault(sum-goal,0);
           map.put(sum,map.getOrDefault(sum,0)+1);
       }
        System.out.println(count);
    }
}
