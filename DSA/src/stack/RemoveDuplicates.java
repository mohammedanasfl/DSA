package stack;

import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        char [] c=s.toCharArray();
        Stack<Character>stack=new Stack<>();
        for (char value : c) {
            if (!stack.isEmpty() && value == stack.peek()) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }
       StringBuilder stringBuilder=new StringBuilder();
        stack.forEach(stringBuilder::append);
        return stringBuilder.toString();

    }
    public static void main(String[]args){
        System.out.print(removeDuplicates("abbaca"));

        System.out.print(removeDuplicates("azxxzy"));
    }
}
