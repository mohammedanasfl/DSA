package challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits="2";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String>result=new ArrayList<>();
        result.add("");
        for(char c:digits.toCharArray()){
            List<String>newResult=new ArrayList<>();
            String letters =map.get(c);
            for(String words:result){
                for(char letter :letters.toCharArray()){
                    newResult.add(words+letter);
                }
            }
            result=newResult;
        }
        return result;
    }
}
