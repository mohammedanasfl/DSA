package string;

import java.util.Stack;

public class MaxLen {
    public static void main(String[] args) {
        System.out.println(maxLen("(())))()())()()(()(()(()))(()(())(()(())(())((()())))())()()(()())(((())))(())()))())(((()((()(((()((((())()(((((()()(()(((())(((())((((())((()(((())))()()))()))()(())((((((()())(()))()()(()(())))((()()(()(((((())))(((()()((()))()(()(())(((())))))"));
    }

        static int maxLen(String s) {
            Stack<Integer> stack = new Stack<>();
            stack.push(-1); // Important for base comparison
            int maxLength = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i); // Reset base
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
            return maxLength;
        }

}
