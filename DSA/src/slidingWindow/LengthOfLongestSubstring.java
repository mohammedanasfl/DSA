package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";

        int left=0,right=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();

        while(right<s.length()){

            char c=s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength=Math.max(maxLength,right-left+1);
            right++;

        }
        System.out.println("Longest SubString Length is "+maxLength);

    }

}
