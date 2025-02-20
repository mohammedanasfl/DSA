package stack;

import java.util.Stack;

public class RemoveStars {
    public static String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c =='*'){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
    return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
