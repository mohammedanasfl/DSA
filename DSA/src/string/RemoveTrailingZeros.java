package string;

public class RemoveTrailingZeros {
    public static void main(String[] args) {
        String num="51230100";
        int i;
        for(i=num.length()-1;i>=0;i--) {
            int curr=num.charAt(i)-'0';
            if(curr!=0) break;
        }
        System.out.println(num.substring(0,i+1));
    }
}
