package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SimilarPairs {
    public static void main(String[] args) {
        String[]words={"aba","aabb","abcd","bac","aabc"};
        Map<String,Integer>map=new HashMap<>();

        for(String s:words){
            Set<Character> set = new TreeSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (char c : set) {
                keyBuilder.append(c);
            }
            String key = keyBuilder.toString();

            // Update frequency of that key
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1)) / 2; // nC2
            }
        }
        System.out.println(count);
    }
}
