package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DecodeMessage {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";

        Map<Character,Integer>map=new HashMap<>();
        int index=0;
        for(char c:key.toCharArray()){
            if(map.containsKey(c)|| c ==' '){
                continue;
            }
            map.put(c,index++);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:message.toCharArray()){
            if(c ==' '){
                stringBuilder.append(c);
                continue;
            }
            int n=97+map.get(c);
            stringBuilder.append((char)n);

        }
        System.out.println(stringBuilder.toString());
    }
}
