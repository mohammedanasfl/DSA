package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimes07032025 {

    public static int[] closestPrimes(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        int firstNum=-1;
        int secondNum=-1;
        for(int i=1;i<list.size();i++){
            int diff=list.get(i)-list.get(i-1);
            if(diff<min){
                min=diff;
                firstNum=list.get(i-1);
                secondNum=list.get(i);
            }
        }
        return new int[]{firstNum,secondNum};

    }

    private static boolean isPrime(int num) {
        if(num<=1) return false;
        if(num<=3)return  true;
        if(num % 2 == 0|| num % 3 == 0)return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestPrimes(10,19)));
    }
}
