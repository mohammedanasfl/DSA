package string;

public class CountKeyChanges {
    public static void main(String[] args) {
        String s="AaAaAaaA";
        char currentChar=Character.toLowerCase(s.charAt(0));
        int count=0;
        for(int i=1;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i))!=currentChar){
                currentChar=Character.toLowerCase(s.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
}
