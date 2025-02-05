package stack;

import java.util.Arrays;
import java.util.Stack;

public class Find132pattern {
    public static boolean  find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }


            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String [] args){
        System.out.print(
                find132pattern(new int[]{3,1,4,2}));
    }

}
