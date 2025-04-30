package Math;

import java.util.Arrays;
import java.util.List;

public class MinimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int result=0;
        for(List<Integer>i:triangle){
            int min=Integer.MAX_VALUE;
            for(int j:i){
                min=Math.min(min,j);
            }
            result+=min;
        }
        return result;


    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                List.of(-1),
                Arrays.asList(2, 3),
                Arrays.asList(1,-1,-3)
        );

        System.out.println(minimumTotal(triangle));
    }
}
