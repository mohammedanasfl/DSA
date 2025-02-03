package stack;

import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        char [] c=s.toCharArray();
        Stack<Character>stack=new Stack<>();
        stack.push(c[0]);
        for(int i=1;i<c.length;i++){
            if( !stack.isEmpty() && c[i]==stack.peek()){
                stack.pop();
            }else{
                stack.push(c[i]);
            }
        }
       StringBuilder stringBuilder=new StringBuilder();
        stack.forEach(str->stringBuilder.append(str));
        return stringBuilder.toString();

    }
    public static void main(String[]args){
        System.out.print(removeDuplicates("abbaca"));

        System.out.print(removeDuplicates("azxxzy"));
    }
}
