package leetCodeDailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class DivideArray17032025 {

    public static boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i:map.values()){
            if(i %2 != 0) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(divideArray(new int[]{9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17}));
    }
}
