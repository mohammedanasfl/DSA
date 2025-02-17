package stack;

import java.util.Stack;

public class MakeGood {
    public static String makeGood(String s) {
        Stack<Character>stack=new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (Character.toLowerCase(top) == Character.toLowerCase(c) && top != c) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        StringBuilder str=new StringBuilder();
        for(int i=stack.size()-1;i>=0;i--){
            str.append(stack.pop());
        }
        return str.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(makeGood("kkdsFuqUfSDKK"));
    }
}
