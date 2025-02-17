package leetCodeDailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumTilePossibilities17022025 {
    public static int numTilePossibilities(String tiles) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:tiles.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return backTrack(map);

    }

    private static int backTrack(Map<Character, Integer> map) {
        int ans=0;
        for(char c:map.keySet()){
            if(map.get(c)>0){
                ans++;
                map.put(c,map.get(c)-1);
                ans+=backTrack(map);
                map.put(c,map.get(c)+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
