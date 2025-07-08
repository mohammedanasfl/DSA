package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubstring {
    public static void main(String[] args) {
        String s="bcbbbcba";

        Map<Character,Integer> map=new HashMap<>();
         int left=0,right=0;
         int maxLength=0;

         while(right<s.length()){
             char currentChar=s.charAt(right);
             map.put(currentChar,map.getOrDefault(currentChar,0)+1);

             while(map.get(currentChar)>2){
                 map.put(s.charAt(left), map.get(s.charAt(left))-1);
                 left++;
             }
             maxLength=Math.max(maxLength,right-left+1);
             right++;
         }
        System.out.println(maxLength);
    }
}
