package leetCodeDailyQuestions;

import java.util.Arrays;

public class PivotArray03032025 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }

        return result;


    }

    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pivotArray(new int[]{-3,4,3,2},2)));
    }
}
