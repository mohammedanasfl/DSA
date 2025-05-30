package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maxFreqSum {
    public static void main(String[] args) {
        String s="successes";
        Map<Character,Integer>vowel=new HashMap<>();
        Map<Character,Integer>con=new HashMap<>();

        String vow="aeiou";

        for(char c:s.toCharArray()){
            if(vow.indexOf(c)!=-1){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
            }
            else{
                con.put(c,con.getOrDefault(c,0)+1);
            }
        }
        int vowSum=0,conSum=0;
        for(int i:vowel.values()){
            vowSum=Math.max(i,vowSum);
        }
        for(int i:con.values()){
            conSum=Math.max(i,conSum);
        }
        System.out.println(vowSum+conSum);
    }
}
