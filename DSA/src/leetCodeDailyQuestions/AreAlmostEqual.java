package leetCodeDailyQuestions;

import java.util.Arrays;

public class AreAlmostEqual {

    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] c =s1.toCharArray();
        char[] d =s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)) {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) count++;
                if (count > 2) return false;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public static void main(String []args){
        System.out.print(areAlmostEqual("bank","knab"));
    }
}
