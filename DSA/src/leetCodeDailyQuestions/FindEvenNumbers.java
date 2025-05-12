package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int [] arr={2,2,8,8,2};
        List<Integer>list=new ArrayList<>();

        for(int i=100;i<=998;i+=2){
            String s=String.valueOf(i);
            if(check(s,arr)){
                list.add(i);
            }
        }
        Collections.sort(list);
        list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean check(String s, int[] arr) {
        int [] frqArr=new int[10];
        int [] frqS=new int [10];
        for(int i:arr){
            frqArr[i]++;
        }
        for(char c:s.toCharArray()){
            frqS[c-'0']++;
        }
        for(int i=0;i<10;i++){
            if(frqS[i]>frqArr[i]){
                return false;
            }
        }
        return true;
    }
}
