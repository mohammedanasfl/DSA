package recursion;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(length("anas"));
    }

    private static int length(String str) {
        if(str=="") return  0;

        return length(str.substring(1))+1;
    }
}
