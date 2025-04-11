package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDays24032025{
    public static int countDays(int days, int[][] meetings) {
        int today = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] meeting : meetings) {
            int i = meeting[0], j = meeting[1];

            if (j <= today) continue;
            else if (i > today) days -= j - i + 1;
            else days -= j - today;

            today = j;
        }

        return days;
    }

    public static void main(String[] args) {
        System.out.println(countDays(10,new int[][]{{5,7},{1,3},{9,10}}));
    }
}
