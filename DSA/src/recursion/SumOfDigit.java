package recursion;

public class SumOfDigit {

    public static void main(String[] args) {

        int n=12345;
        System.out.println(sumOfDigit(n));
    }

    private static int sumOfDigit(int n) {
        if(n==0) return 0;
       return sumOfDigit(n/10)+n%10;
    }

}
