package recursion;

public class Fibno {

    public static void main(String[] args) {
        System.out.println(fibno(6));
    }

    private static int fibno(int i) {
        if(i<2) return i;
        return fibno(i-1)+fibno(i-2);
    }
}
