package leetCodeDailyQuestions;

import java.util.HashMap;

public class maximumSum12022025 {
    public static int maximumSum(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = digitSum(num);

            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num)); // Store max num for this sum
            } else {
                map.put(digitSum, num);
            }
        }

        return maxSum;

    }

    private static int  digitSum(int num) {
        int sum=0;
        while(num!=0){
            int x=num%10;
            sum=sum+x;
            num/=10;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int []{18,43,36,13,7}));
    }

}
