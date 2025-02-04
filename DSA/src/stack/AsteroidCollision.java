package stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int i:asteroids){

            while(!stack.isEmpty() && i<0 && stack.peek()>0){
                int top=stack.pop();
                if(Math.abs(top)>Math.abs(i)){
                    stack.push(top);
                    i=0;
                }else if(Math.abs(top) == Math.abs(i)){
                    i=0;
                }
            }
            if(i !=0){
                stack.push(i);
            }
        }
       int []result=new int[stack.size()];
       for(int i=result.length-1;i>=-0;i--){
           result[i]=stack.pop();
       }

        return result;
    }

    public static void main(String[]args){
        System.out.print(Arrays.toString(asteroidCollision(new int[]{10,2,-12})));
    }
}
