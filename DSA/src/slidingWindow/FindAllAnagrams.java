package slidingWindow;

import java.util.*;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);  // Expected: [0, 6]
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if (s.length() < p.length()) return result;
        int [] pFreq=new int[26];
        int [] cFreq=new int[26];
        for(char c:p.toCharArray()) pFreq[c-'a']++;

        for(int i=0;i<p.length();i++) cFreq[s.charAt(i)-'a']++;

        if(Arrays.equals(pFreq,cFreq)) result.add(0);

        for(int i=p.length();i<s.length();i++){
            cFreq[s.charAt(i)-'a']++;
            cFreq[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pFreq,cFreq)) result.add(i-p.length()+1);
        }
        return result;
    }
}

