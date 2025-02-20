package recursion;

public class easy {

    public static void main(String[] args) {
//        NTo1(5);
        oneToN(1,10);
    }

    private static void oneToN(int s, int n) {
        if(s==n) {
            System.out.println(s);
            return;
        }
        System.out.println(s);
        oneToN(s+1,n);
    }

    private static void NTo1(int n) {
        if(n ==0){
            return;
        }
        System.out.println(n);
        NTo1(n-1);

    }
}
