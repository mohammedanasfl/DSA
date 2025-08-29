package slidingWindow;

import java.util.*;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int []nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    public static int[] maxSlidingWindowoo(int[] nums, int k) {

        List<Integer>list =new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            list.add(max);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int ri = 0;

        for (int i = 0; i < n; i++) {
            // Remove indices outside current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller values from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Store max in result (front of deque)
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
