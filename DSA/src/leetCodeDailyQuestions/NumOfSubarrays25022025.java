package leetCodeDailyQuestions;

public class NumOfSubarrays25022025 {

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{1,3,5}));

    }
    public static int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int odd = 0, even = 1;
        int result = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % 2 == 1) {
                result = (result + even) % MOD;
                odd++;
            } else {
                result = (result + odd) % MOD;
                even++;
            }
        }

        return result;

    }
}
