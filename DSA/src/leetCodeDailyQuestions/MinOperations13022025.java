package leetCodeDailyQuestions;

import java.util.PriorityQueue;

public class MinOperations13022025 {
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int operations=0;
        while (pq.peek()<k){
            int x=pq.poll();
            int y=pq.poll();
            operations++;
            pq.add(2*x+y);
        }
        return operations;

    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,11,10,1,3},10));
    }

}
