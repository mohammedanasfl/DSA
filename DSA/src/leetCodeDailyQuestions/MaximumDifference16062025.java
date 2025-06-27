package leetCodeDailyQuestions;

public class MaximumDifference16062025 {
    public static void main(String[] args) {
        int [] arr={7,1,5,4};

        int min = arr[0];
        int maxDiff = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                maxDiff = Math.max(maxDiff, arr[i] - min);
            } else {
                min = arr[i]; // update minimum so far
            }
        }

        System.out.println(maxDiff);
    }
}
