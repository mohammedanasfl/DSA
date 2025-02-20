package stack;

import java.util.Stack;

public class DecodeAtIndex {
    public static String decodeAtIndex(String s, int k) {
        StringBuilder str=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        int num=0;

        for(char c:s.toCharArray()){

            if(Character.isDigit(c)){
                num=(num*10)+c-'0';
            }else{
                if (num > 0) {
                    str.append(String.valueOf(temp).repeat(num));
                    temp=str;
                    num = 0;
                } else {
                    temp.append(c);
                }
            }

        }
        str.append(String.valueOf(temp).repeat(num));
        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(decodeAtIndex("ha22",5));
    }
}
