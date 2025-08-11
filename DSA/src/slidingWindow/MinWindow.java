package slidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public static void main(String[] args) {
        String s ="AAABBBCCC";
        String t="ABC";

//        StringBuilder result=new StringBuilder();
//
//        for(int i=0;i<s.length();i++){
//            StringBuilder temp=new StringBuilder();
//            for (int j=i;j<s.length();j++){
//                temp.append(s.charAt(j));
//                if(isContainAll(temp.toString(),t)){
//                    if(result.length()>temp.length() || result.isEmpty()){
//                        result=new StringBuilder(temp);
//                    }
//                    break;
//                }
//
//
//            }
//        }
        System.out.println(minWindow(s,t));
    }

    private static boolean isContainAll(String toCheckString, String t) {
        for(int i=0;i<t.length();i++){
            if(toCheckString.indexOf(t.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
    //optimised
    public static String minWindow(String s, String t) {
        int left=0;
        int right=0;
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        int startIndex=0;
        for(char c:t.toCharArray()) need.put(c,need.getOrDefault(c,0)+1);
        while(right<s.length()){
            char currentChar=s.charAt(right);
            window.put(currentChar,window.getOrDefault(currentChar,0)+1);
            right++;
            while(windowMatches( window, need)){
                if(right-left<minLen){
                    minLen=right-left;
                    startIndex=left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) window.remove(leftChar);
                left++;
            }

        }
        return minLen ==Integer.MAX_VALUE ?"":s.substring(startIndex,startIndex+minLen);

    }

    private static boolean windowMatches(Map<Character, Integer> window, Map<Character, Integer> need){
        for(char c : need.keySet()){
            if(window.getOrDefault(c, 0) < need.get(c)) return false;
        }
        return true;
    }

}

