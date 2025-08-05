package string;

import java.util.Arrays;

public class percentageLetter {
    public static void main(String[] args) {
        String s="foobar";
        char letter='o';

       int count=0;
       for(char c:s.toCharArray()) {if(c == letter) count++;}

        System.out.println((count*100) /s.length());
    }
}
