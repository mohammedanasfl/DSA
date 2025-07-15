package string;

import java.util.ArrayList;
import java.util.List;

public class IsAcronym {
    public static void main(String[] args) {
        List<String>words=new ArrayList<>(List.of("a","b","c"));
        String s="abcd";
        boolean result=true;
        int n= Math.max(words.size(), s.length());
        for(int i=0;i<n;i++){
            if((s.length()<=i)||(words.size()<=i)||words.get(i).charAt(0)!=s.charAt(i)){
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
}
