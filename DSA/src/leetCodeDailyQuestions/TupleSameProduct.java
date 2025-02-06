package leetCodeDailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class TupleSameProduct {

    public static int tupleSameProduct(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }
        int result=0;
        for(int i:map.values()){
            if(i>1){
                result+=i*(i-1)*4;
            }
        }
        return result;


    }


    public static void main(String[] args) {
        System.out.print(tupleSameProduct(new int[]{2,3,4,6}));
    }

}
