package Array;

import java.util.Arrays;

public class MaxWidthOfVerticalArea {
    public static void main(String[] args) {
        int [][] points ={
                {3,1},{9,0},{1,0},{1,4},{5,3},{8,8}
        };
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int max=0;

        for(int i=1;i<points.length;i++){
            int sub=points[i][0]-points[i-1][0];
            max=Math.max(max,sub);
        }

        System.out.println(max);
    }
}
