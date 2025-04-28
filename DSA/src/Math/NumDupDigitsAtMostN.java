package Math;

public class NumDupDigitsAtMostN {
    public static int numDupDigitsAtMostN(int n) {
        int count = 0;
        for (int i = 10; i <= n; i++) {
            if (hasDuplicate(i)) count++;
        }
        return count;
    }

    static boolean hasDuplicate(int num) {
        boolean[] seen = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) return true; // duplicate found
            seen[digit] = true;
            num /= 10;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(numDupDigitsAtMostN(1000));
    }
}
