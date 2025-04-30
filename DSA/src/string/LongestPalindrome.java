package string;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabbaa"));
    }
    static String longestPalindrome (String s){

        String str="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ss=s.substring(i,j);
                if (checkIsPalindrome(ss) && ss.length() > str.length()){
                    str = ss;
                }
            }
        }
        return str;
    }

    private static boolean checkIsPalindrome(String ss) {
        StringBuilder str=new StringBuilder(ss);
        return ss.equals(str.reverse().toString());
    }

}
