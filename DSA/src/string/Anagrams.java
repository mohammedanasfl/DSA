package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(anagrams(new String[]{"act", "god", "cat", "dog", "tac"}));
    }

    private static ArrayList<ArrayList<String>>  anagrams(String[] strings) {
        Map<String,ArrayList<String>>map=new HashMap<>();
        for(String s:strings){
            char []c=s.toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
