package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int maxLen=0;
        while(right<s.length()){
            char currentChar=s.charAt(right);
            map.put(currentChar,map.getOrDefault(currentChar,0)+1);
            right++;
            while(map.size()> k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }
            maxLen=Math.max(right-left,maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int result = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println("Longest substring length with at most " + k + " distinct characters: " + result);
    }
}
