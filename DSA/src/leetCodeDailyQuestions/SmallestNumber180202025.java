package leetCodeDailyQuestions;

import java.util.Stack;

public class SmallestNumber180202025 {
    public static String smallestNumber(String pattern) {
        StringBuilder str=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<=pattern.length();i++){
            stack.push(i+1);

            if(i ==pattern.length()||pattern.charAt(i)=='I'){
                while (!stack.isEmpty()){
                    str.append(stack.pop());
                }
            }

        }
        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(smallestNumber("IDID"));
    }
}
