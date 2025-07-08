package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountPoints {
    public static void main(String[] args) {
        String rings="B0B6G0R6R0R6G9";

        Map<Integer, Set<Character>>map=new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            map.computeIfAbsent(rod, k -> new HashSet<>()).add(color);
        }int count=0;
        for(Set<Character>s:map.values()){
            if(s.size()==3) count++;
        }
        System.out.println(count);
    }
}
