package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountGoodSubstrings {
    public static void main(String[] args) {

        String s="aababcabc";

        int left=0,right=0,maxLength=0;
        Map<Character,Integer>map=new HashMap<>();
        while(right<s.length()){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1||map.size()>3){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;

            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        System.out.println(maxLength);
    }
}
