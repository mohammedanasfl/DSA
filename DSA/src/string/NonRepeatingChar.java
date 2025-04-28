package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    static char nonRepeatingChar(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> m:map.entrySet()){
            if(m.getValue()== 1) return m.getKey();
        }
        return '$';
    }

    public static void main(String[] args) {
        System.out.println("geeksforgeeks");
    }
}
