package string;

public class LongestCommonSubstr {
    public static void main(String[] args) {

        System.out.println(longestCommonSubstr("ABCDGH","ACDGHR"));
    }
    static int longestCommonSubstr(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                String sub=s1.substring(i,j);
                if(s2.contains(sub)){
                    count=Math.max(count,sub.length());
                }

            }
        }

        return count;
    }
}
