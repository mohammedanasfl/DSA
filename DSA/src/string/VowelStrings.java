package string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelStrings {
    public static void main(String[] args) {
        String []  words={"are","amy","u"};
        int left=0,right=2;

        int count=0;
        String set="aeiou";
        for(int i=left;i<=right;i++){
            String current=words[i];
            if(set.indexOf(current.charAt(0))!=-1&& set.indexOf(current.charAt(current.length()-1))!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
