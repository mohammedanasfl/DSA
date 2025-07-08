package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RowAndMaximumOnes {
    public static void main(String[] args) {
        int [][] mat={
                {0,1},{1,0}
        };
        int row=0;
        int maxCount=0;
        for(int []i:mat){
            int sum=0;
            for (int k : i) {
                if(k ==1) sum++;
            }
            if(sum > maxCount){
                maxCount=sum;
                row++;
            }
        }
        System.out.println(Arrays.toString(new int[]{row-1,maxCount}));

    }
}
