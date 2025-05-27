package GeeksForGeeksDSACourse.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMajority {
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>list=new ArrayList<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int occurs=nums.length/3;

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>occurs){
                list.add(e.getKey());
            }
        }
        return list;
    }
}
