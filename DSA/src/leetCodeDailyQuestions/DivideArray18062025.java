package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray18062025 {
    public static void main(String[] args) {
        int [] arr={1,3,4,8,7,9,3,5,1};
        int k=2;
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        if (n % 3 != 0) return new int[0][0];

        int[][] result = new int[n / 3][3];
        int group = 0;

        for (int i = 0; i < n; i += 3) {
            int min = nums[i];
            int mid = nums[i + 1];
            int max = nums[i + 2];

            if (max - min > k) return new int[0][0];

            result[group][0] = min;
            result[group][1] = mid;
            result[group][2] = max;
            group++;
        }

        return result;
    }

}
