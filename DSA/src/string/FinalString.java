package string;

public class FinalString {
    public static void main(String[] args) {
        String s="string";
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c == 'i') stringBuilder.reverse();
            else stringBuilder.append(c);
        }
        System.out.println(stringBuilder.toString());
    }
}
