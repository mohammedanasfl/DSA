package string;

import java.util.*;

public class minDeletion {
    public static void main(String[] args) {
        String s="yyyzz";
        int k=1;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        if (map.size() <= k) return ;
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int count = 0;
        int dst = list.size();
        int i = 0;
        while (dst > k) {
            count += list.get(i);
            i++;
            dst--;
        }
        System.out.println(count);
    }
}
