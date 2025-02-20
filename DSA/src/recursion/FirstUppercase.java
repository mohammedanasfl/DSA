package recursion;

public class FirstUppercase {
    public static void main(String[] args) {
        String s="anasMN";
        System.out.println(firstUpperCase(s,0));
    }

    private static char firstUpperCase(String s, int i) {
        if(i ==s.length()) return 'x';
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        return firstUpperCase(s,i+1);
    }
}
