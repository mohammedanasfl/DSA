package Array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int [] nums={100,4,200,1,3,2};


        Set<Integer>set=new HashSet<>();
        for(int i:nums) set.add(i);
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int x=num;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest=Math.max(count,longest);
            }
        }
        System.out.println(longest);


    }
}
