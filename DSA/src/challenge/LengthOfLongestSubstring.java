package challenge;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s="pwwkew";
        Map<Character,Integer>map=new HashMap<>();
        int left=0,right=0;
        int maxCount=0;
        while(right <s.length() ){
            char r=s.charAt(right);
            map.put(r,map.getOrDefault(r,0)+1);
            while(map.get(r)!=null && map.get(r)>1){
                char l=s.charAt(left);
                map.put(l, map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                left++;
            }
            maxCount=Math.max(maxCount,right-left+1);
            right++;
        }
        System.out.println(maxCount);
    }
}
