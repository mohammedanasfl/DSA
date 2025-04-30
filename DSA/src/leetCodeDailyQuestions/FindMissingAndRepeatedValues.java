package leetCodeDailyQuestions;

import java.util.*;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}})));

    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid.length;
       int []fre=new int[n+1];
       int repeated=-1,missing=-1;

        for(int[] i :grid){
            for(int j:i){
                fre[j]++;
            }
        }
        for (int num = 1; num <=n; num++) {
            if (fre[num] == 2) repeated = num;
            if (fre[num] == 0) missing = num;
        }

        return  new int[]{repeated,missing};

    }
}
