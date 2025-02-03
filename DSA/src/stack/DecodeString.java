package stack;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<StringBuilder>strStack=new Stack<>();
        int currNum=0;
        StringBuilder currStr=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
               currNum=currNum*10+(c-'0');
            } else if (c == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                currNum=0;
                currStr=new StringBuilder();
            } else if (c ==']') {
                int count = numStack.pop();
                StringBuilder repeated = strStack.pop();
                for (int i = 0; i < count; i++) {
                    repeated.append(currStr);
                }
                currStr = repeated;
            }else {
                currStr.append(c);
            }
        }
        return currStr.toString();

    }

    public static void main(String[]args){
        System.out.print("Size = "+decodeString("100[leetcode]"));
    }
}

