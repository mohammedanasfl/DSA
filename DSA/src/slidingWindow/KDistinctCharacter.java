package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class KDistinctCharacter {
    public static void main(String[] args) {
        String s="aaacbbccd";
        int k=2;

        Map<Character,Integer>map=new HashMap<>();
        int left=0,right=0,maxLen=0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        System.out.println(maxLen);

    }
}
