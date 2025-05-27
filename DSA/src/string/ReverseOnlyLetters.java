package string;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        int left=0,right=s.length()-1;
        char [] c=s.toCharArray();
        while(left<right){
            if(!Character.isLetter(c[left])) left++;
            else if (!Character.isLetter(c[right])) right--;
            else {
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(c));
    }
}
