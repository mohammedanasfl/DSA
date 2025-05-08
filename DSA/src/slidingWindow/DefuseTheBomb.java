package slidingWindow;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int [] arr={5,7,1,4};
        int k=3;
        System.out.println(Arrays.toString(decrypt(arr, k)));
    }

        public static int[] decrypt(int[] circ, int k) {
            int n = circ.length; // circular array
            int[] result = new int[n];

            if (k == 0) return result;

            int wSum = 0;
            int start = (k > 0) ? 1 : n + k;
            int end = (k > 0) ? k : n - 1;

            for (int i = start; i <= end; i++) {
                wSum += circ[i % n];
            }

            for (int i = 0; i < n; i++) {
                result[i] = wSum;
                wSum -= circ[(start + i) % n];
                wSum += circ[(end + i + 1) % n];
            }

            return result;
        }

}
