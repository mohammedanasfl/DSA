package recursion;

import java.util.Scanner;

public class GeekOnacciSeries {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(geekOnacciSeries(A, B, C, N));
        }

    }
    private static int geekOnacciSeries(int A, int B, int C, int n) {
        if(n==1) return A;
        if(n==2) return B;
        if(n==3) return C;
        return geekOnacciSeries(A, B, C, n-1)+geekOnacciSeries(A, B, C, n-2)+geekOnacciSeries(A, B, C, n-3);

    }

}
