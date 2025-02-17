package stack;

import java.util.Stack;

public class MinLength {

    public static int minLength(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()){
                String str=stack.peek()+""+c;
                if(str.equals("AB")|| str.equals("CD")) stack.pop();
                else stack.push(c);

            }else{
                stack.push(c);
            }
        }
        return stack.size();

    }

    public static void main(String[] args) {
        System.out.println(minLength("ACBBD"));
    }
}
