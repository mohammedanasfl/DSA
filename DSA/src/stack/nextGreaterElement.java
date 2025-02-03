package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];

            while(!stack.empty() && stack.peek()<=num){
                stack.pop();
            }

            map.put(num,stack.empty()?-1:stack.peek());
            stack.push(num);

        }

        int []result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;

    }

    public static void main(String[]args){
        int []arr=nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        System.out.print(Arrays.toString(arr));
    }
}
