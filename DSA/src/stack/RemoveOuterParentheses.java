package stack;

public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c =='('){
                count++;
                str.append('(');
            }else{
                if(count == 0) i++;
                else{
                    str.append(')');
                    count--;
                }
            }
        }
        return str.toString();

    }

    public static void main(String[]args){
        System.out.print(removeOuterParentheses("(()())(())"));
    }
}
