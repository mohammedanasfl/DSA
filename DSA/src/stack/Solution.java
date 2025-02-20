package stack;

import java.util.*;

public class Solution {

    public static boolean isValid(String s) {

            Stack<Character> stack= new Stack<>();

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                    stack.push(s.charAt(i));
                }
                else {
                    if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid(
                "))"));

        System.out.println("This    is    an".length());


        String s="232-1";
        int num=0;
        for(char c:s.toCharArray()){

            if(Character.isDigit(c)){
                num=(num*10)+c-'0';
                System.out.println("num "+ num);

            }else{
                num=0;
            }

        }


    }
}
