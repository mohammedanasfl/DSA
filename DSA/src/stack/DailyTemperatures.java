package stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int [] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                    int index= stack.pop();
                    result[index]=i-index;
            }
            stack.push(i);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}
