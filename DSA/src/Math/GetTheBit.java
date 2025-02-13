package Math;

public class GetTheBit {
    public static void main(String[] args) {
        int n=2;
        int num=13;
        if ((num>>(n -1) &1) ==1) System.out.println("1");
        else System.out.println("0");
    }
}
